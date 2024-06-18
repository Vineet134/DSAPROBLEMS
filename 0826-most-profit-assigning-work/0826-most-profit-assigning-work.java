class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
      int n=difficulty.length;
         int [][] jobs=new int [n][2];
      for(int i=0;i<n;i++){
        jobs[i][0]=difficulty[i];
        jobs[i][1]=profit[i];
      }

      Arrays.sort(jobs,(a,b)->a[0]-b[0]);
      Arrays.sort(worker);

       
        int maxprofit=0;
       int i=0;
       int good=0;
        for(int j:worker){
            while(i<n &&j>=jobs[i][0]){
                good=Math.max(good,jobs[i][1]);
                i++;
            }
   maxprofit+=good;
        }
     
    return maxprofit;
    //         for(int j=difficulty.length-1;j>=0;j--){
    //              for(int i=worker.length-1;i>=0;i--){
    //             if(difficulty[j]<=worker[i]){
    //                 sum+=profit[j];
    //                 worker[i]=0;
    //         }
    //         else{
    //             continue;
    //         }
    //     }
    //   }
    //   return sum;
    }
}