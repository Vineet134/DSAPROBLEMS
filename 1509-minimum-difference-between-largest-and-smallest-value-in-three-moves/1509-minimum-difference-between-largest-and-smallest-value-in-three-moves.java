
    class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;

 
        if (n <= 4) return 0;

        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;

        for (int left = 0, right = n- 4; left < 4; left++, right++) {
            diff = Math.min(diff, nums[right] - nums[left]);
        }

        return diff;
    }
}
