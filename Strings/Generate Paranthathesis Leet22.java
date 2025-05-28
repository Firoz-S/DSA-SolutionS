class Solution {
    ArrayList<String> l;
    public void parant(int open,int close,int n,String s){
        if(s.length()==n*2){
            l.add(s);
            return;
        }
        if(open<n) parant(open+1,close,n,s+"(");
        if(close<open) parant(open,close+1,n,s+")");
    }
    public List<String> generateParenthesis(int n) {
        l=new ArrayList<>();
        parant(0,0,n,"");
        return l;
    }
}
