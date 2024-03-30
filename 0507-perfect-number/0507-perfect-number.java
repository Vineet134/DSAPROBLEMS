class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=1;
        int sum=0;
           while(i<num){
               if(num%i==0){
                   sum+=i;
               }
               i++;
            
           }
        
        if(sum==num){
            return true;
        }
                
        
        
        return false;
    }
}
