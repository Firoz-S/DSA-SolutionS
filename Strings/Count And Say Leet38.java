class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1)+"@";
        int i=0;
        int j=0;
        int len=0;
        String ans="";
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                len=j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        return ans;
    }
}
