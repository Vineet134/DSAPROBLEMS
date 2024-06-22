class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int result=0;
        int r=0;
        int j=0;
        int i=0;
       while(i<nums.length){
        if(nums[i]%2!=0){
                count++;
                r=0;
            }
          while(count==k){
         r++;
         if(nums[j]%2!=0){
            count--;
         }
         j++;
          }
          result+=r;
        i++;
       }
      return result;
    }
}