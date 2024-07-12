// class Solution {
//     public int maximumGain(String s, int x, int y) {
//         int count=0;
//         StringBuilder sb=new StringBuilder();
//          int i=1;
//         int max=Integer.MIN_VALUE;
//         boolean m=(s.charAt(i)=='a'&&s.charAt(i+1)=='b');
//         boolean n=(s.charAt(i)=='b'&& s.charAt(i+1)=='a');

//         while(i!=s.length()-1){
//             if( !m || !n){
//                 sb.append(s.charAt(i));
//                 i++;
//                 continue;
//             }  
//              count+=(m==true)?x:y;
//             sb.delete(i,i+1);
//             i++;
//         }
//         return count;
//     }
// }
class Solution {
    public int maximumGain(String s, int x, int y) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length() - 1) {
            if ((sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b' && x >= y) ||
                (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a' && y > x)) {
                count += (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') ? x : y;
                sb.delete(i, i + 2);
                i = Math.max(0, i - 1); 
            } else {
                i++;
            }
        }
        
   
        i = 0;
        while (i < sb.length() - 1) {
            if ((sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b' && x < y) ||
                (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a' && y <= x)) {
                count += (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') ? x : y;
                sb.delete(i, i + 2);
                i = Math.max(0, i - 1);
            } else {
                i++;
            }
        }
        
        return count;
    }
}
