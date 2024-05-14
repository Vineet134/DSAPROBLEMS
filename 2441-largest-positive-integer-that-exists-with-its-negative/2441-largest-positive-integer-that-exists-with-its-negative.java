class Solution {
    public int findMaxK(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        // int ans = -1;
        // for(int num : nums){
        //     hs.add(num);
        //     int k = num*(-1);
        //     if(hs.contains(k)){
        //         ans = Math.max(ans,Math.abs(num));
        //     }
        // }
        // return ans;
        int max=-1;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return -1;
            }
            if(nums[i]<0){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]*-1){
                        count =nums[i];
                        max=Math.max(Math.abs(count),max);
                    }
                }
            }
        }
        return max;
    }
}