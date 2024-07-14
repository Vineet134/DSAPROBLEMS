class Solution {
    public static int count(int arr[],int si,int mid,int ei)
    {
        int max_cnt = 0;
        int j = mid+1;
        for (int i=si;i<=mid;i++){
            while (j<=ei && arr[i] > (2*(long)arr[j])) j++;
            max_cnt += j - (mid+1);
        }
        int temp[]=new int[ei-si+1];//array index start from 0
        int i=si;
        j=mid+1;
        int tempIndex=0;
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[tempIndex]=arr[i];
                i++;
                tempIndex++;
            }
            else
            {
                temp[tempIndex]=arr[j];
                j++;
                tempIndex++;
            }
        }
        //for remaining elemnts
        //left
        while(i<=mid)
        {
            temp[tempIndex++]=arr[i++];
        }
        //right
        while(j<=ei)
        {
            temp[tempIndex++]=arr[j++];
        }
        i=si;
        for(int k=0;k<temp.length;k++)
        {
            arr[i]=temp[k];
            i++;
        }
        return max_cnt;
    }
    public static int mergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return 0;
        }
        int mid=si+(ei-si)/2;
        int c=mergeSort(arr,si,mid);
        c+=mergeSort(arr,mid+1,ei);
        c+=count(arr,si,mid,ei);
        return c;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}

