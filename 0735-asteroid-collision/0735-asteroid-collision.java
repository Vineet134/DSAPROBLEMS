class Solution {
    //positive means right and negative means left
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>s=new Stack<>();
for(int asteroid:asteroids){

boolean val=true;
int p=0;
while( (val && !s.isEmpty()) && (s.peek()>0 && asteroid<0)){
    int t=s.peek();
   
    if(t<-asteroid){
        s.pop();
    }
    else if(t==-asteroid){
        s.pop();
        val=false;
    }
    else{
        val=false;
    }
    
}
if(val){
    s.push(asteroid);
}
}
int result[]=new int[s.size()];

// stack trc
for(int i=s.size()-1;i>=0;i--){
    result[i]=s.pop();
}

return result;

}
}