class Solution {
    public int findCenter(int[][] edges) {
        int count=0;
     int[] f= edges[0];
     int [] s=edges[1];
     if(f[0]==s[0] || f[0] == s[1]){
        return f[0];
     }
     return f[1];
    }
}