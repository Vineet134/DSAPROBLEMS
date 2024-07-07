class Solution {
    public int findKthPositive(int[] arr, int k) {
     int low=0;
     int high=arr.length-1;
     while(low<=high){
        int mid=(low+high)/2;
        int missing=arr[mid]-(mid+1);
        if(missing<k){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
     }
        return k+high+1;
        
    }
}