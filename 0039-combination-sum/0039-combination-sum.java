class Solution {
      List<List<Integer>>s=new ArrayList<>();
        
        ArrayList<Integer>a=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      

          cum(candidates, target, 0);
        return s;
    }

    public void cum(int[] candidates, int target, int start) {
        if (target == 0) {
            s.add(new ArrayList<>(a)); 
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                a.add(candidates[i]);
                cum(candidates, target - candidates[i], i); 
                a.remove(a.size() - 1); 
            }
        }
    }
}

        //   for(int i=0;i<candidates.length;i++){
        //     if(target==candidates[i]){
        //       a.add(candidates[i]);
        //       combinationSum.add(a);
        //     }
        //     int c=0;
        //     for(int j=0;j<candidates.length;j++){
            
        //     int rem=target%candidates[i];

        //     if(rem==candidates[j]){
        //         c=1;
        //         int x=target-rem;
        //         int y=x/candidates[i];
        //         for(int k=0;k<y;k++){
        //             a.add(candidates[i]);
        //         }
        //         a.add(rem);
        //         combinationSum.add(a);
        //         break;
        //     }
        //     break;
        //     }  
        // }
        // return combinationSum;
//     }
// }