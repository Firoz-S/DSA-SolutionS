class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    a.add(1);
                }
                else{
                    a.add(l.get(i-1).get(j)+l.get(i-1).get(j-1));
                }
            }
            l.add(a);
        }
        return l;
    }
}
