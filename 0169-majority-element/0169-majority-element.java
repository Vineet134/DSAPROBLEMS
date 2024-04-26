// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//       int count=0;
//         int max=Integer.MIN_VALUE;
//         Arrays.sort(nums);
//         int arr[]=new int[n];
       
//         for(int i=1;i<n;i++){
//             if(nums[i-1]==nums[i]){
//                 count++;
//                 max=Math.max(count,max);
//             }
//             else{
//                 count=0;
//             }
//             arr[count]=nums[i];
//         }
//     Arrays.sort(arr);
//         if(nums.length==1){
//             return nums[0];
//         }
//         else{
//         return arr[arr.length-1];
//         }
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        // Base case...
        if (nums.length == 1) {
		    return nums[0];
	    }
        // Sort nums array...
        Arrays.sort(nums);
        // Since the majority element appears more than n / 2 times...
        // The n/2 -th element in the sorted nums must be the majority element...
	    return nums[nums.length / 2];
    }
}