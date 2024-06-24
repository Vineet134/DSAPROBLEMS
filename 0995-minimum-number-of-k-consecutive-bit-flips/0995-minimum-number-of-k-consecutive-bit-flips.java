
class Solution {
    // private void flip(int[]A,int k,int i){
    //     for(int j=i;j<i+k;j++){
    //         A[j]=1-A[j];
    //     }
    // }
    // public int minKBitFlips(int[] nums, int k) {
    //     int cnt=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==0){
    //             if(i+k>nums.length)return -1;
    //             flip(nums,k,i);
    //             cnt++;
    //         }
    //     }


    public int minKBitFlips(int[] nums, int k) {
        // Keeps track of flipped states
        boolean[] flipped = new boolean[nums.length];
        // Tracks valid flips within the past window
        int validFlipsFromPastWindow = 0;
        // Counts total flips needed
        int flipCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                // Decrease count of valid flips from the past window if needed
                if (flipped[i - k]) {
                    validFlipsFromPastWindow--;
                }
            }

            // Check if current bit needs to be flipped
            if (validFlipsFromPastWindow % 2 == nums[i]) {
                // If flipping the window extends beyond the array length, return -1
                if (i + k > nums.length) {
                    return -1;
                }
                // Increment the count of valid flips and mark current as flipped
                validFlipsFromPastWindow++;
                flipped[i] = true;
                flipCount++;
            }
        }

        return flipCount;
    }
}