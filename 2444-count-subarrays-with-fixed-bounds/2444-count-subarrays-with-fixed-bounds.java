class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int left = -1, right = 0;
        int minIdx = -1, maxIdx = -1;
        long res = 0;
        for (; right < nums.length; right++) {
            if (nums[right] < minK || nums[right] > maxK)
                left = right;

            if (nums[right] == minK) minIdx = right;
            if (nums[right] == maxK) maxIdx = right;

            res += Math.max(0L, Math.min(minIdx, maxIdx) - left);
        }
        return res;
    
    }
}