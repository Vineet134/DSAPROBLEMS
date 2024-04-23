class Solution {    
    public List<List<Integer>> generate(int numRows) {
        List<Integer> l=null;
        List<List<Integer>> res=new ArrayList() ;
        if(numRows>=1) {
            l=List.of(1);
            res.add(l);
        }
        while(numRows>1) {
            l= convert(l);
            res.add(l);
            numRows--;
        }
        return res;
    }
    List<Integer> convert(List<Integer> l){
      List<Integer> l2=new ArrayList();
        l2.add(1);
        for(int i=1;i<l.size();i++) {
            l2.add(l.get(i-1)+l.get(i));
        }
        l2.add(1);
        return l2;
    } 
}