class Solution {
    public String removeOuterParentheses(String s) {

        int count=0;
        boolean flag=true;
        String ans="";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                count--;
            }
            
             if(count==1 && flag==true){
                flag =false;
                continue;
            }
            if(count==0 && flag==false){
                flag=true;
                continue;
            }
           
            ans+=s.charAt(i);
        }
        return ans;
    }
}