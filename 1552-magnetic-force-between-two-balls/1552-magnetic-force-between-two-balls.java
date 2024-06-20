class Solution {
    public int maxDistance(int[] position, int m) {
//         Arrays.sort(position);

//         int min=position[0];

//         int max=position[position.length-1];
//  int minf=Integer.MAX_VALUE;
//  int result=0;
//         int diff=max-min;
// int c=0;
// if(position.length<position[position.length-1]){
// for(int i=0;i<position.length-1;i++){
//             int p=position[i+1]-position[i];
//             minf=Math.min(p,minf);
//             result=minf;
//             c=1;
// }
// }
//       if(c==1){
//         return result;
//       }

//         int rem=0;
//         int div=0;

//             rem=diff % (m-1);
//             div=(diff)/ (m-1);
//             if(rem!=0){
//                 result=div+rem;
//             }
//             if(rem==0){
//                 result=div;
//             }
//        return result;
//     }
// 
        Arrays.sort(position);
        int lo = 0;
        int hi = position[position.length-1];
        int optimal = 0;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (canPut(position, m, mid)) {
                optimal = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return optimal;
    }
    private boolean canPut(int[] positions, int m, int max) {
        int count = 1;
        int last = positions[0];
        for (int i = 0; i < positions.length; i++) {
            if (positions[i] - last >= max) {
                last = positions[i];
                count++;
            }
        }
        return count >= m;
    }
}