class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>=97&&ch<=122 || ch>=48 && ch<=57){
                sb.append(ch);
            }
        }
        String s1=sb.toString();
        int m=s1.length();
        int i=0;
        int j=m-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
