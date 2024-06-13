class Solution {
    public void sortColors(int[] nums) {
    // selection sort
        int min=Integer.MAX_VALUE;
        int temp=0;
for(int i=0;i<nums.length;i++){
    for(int j=i;j<nums.length;j++){
     if(nums[j]<nums[i]){
         temp=nums[j];
         nums[j]=nums[i];
         nums[i]=temp;
     }
    }
}
        

    }
}