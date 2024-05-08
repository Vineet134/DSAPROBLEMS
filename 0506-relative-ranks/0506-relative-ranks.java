class Solution {
    public String[] findRelativeRanks(int[] score){
        
        Integer[] p=new Integer[score.length];
        for(int i=0;i<score.length;i++){
            p[i]=i;
            
        }
        
     Arrays.sort(p,(a, b) -> score[b] - score[a]);
        // descending order
        
        String result[]=new String[score.length];
        for(int i=0;i<score.length;i++){
            
            if(i==0){
                result[p[i]]="Gold Medal";
            }
            else if (i==1){
                result [p[i]]="Silver Medal";
            }
            else if(i==2)
            {
                result[p[i]]="Bronze Medal";
            }    
            else{
                result[p[i]]=(i+1)+"";
            }
        }
            return result;       
    }
}