class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
    
        int n=happiness.length;
        Arrays.sort(happiness);
        int i=0;
        int j=n-1;
        long ans=0;
        while(i<k){
            ans+=Math.max(0,happiness[j]-i);
            i++;
            j--;
        }
        return ans;
    }
}