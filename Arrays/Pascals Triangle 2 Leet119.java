class Solution {
    public List<Integer> getRow(int r) {
        List<List<Integer>> l=new ArrayList<>(r);
        List<Integer> b=new ArrayList<>();
        for(int i=0;i<=r;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    a.add(1);
                }
                else{
                    a.add(l.get(i-1).get(j)+l.get(i-1).get(j-1));
                }
            
            }
            if(i==r){
                return a;
            }
            l.add(a);
        }
        return b;
    }
}
