class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        char[] c=t.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<s.length();i++){
            if(ch[i]!=c[i]){
                return false;
            }
        }
        return true;
    }
}
