class Solution {
    public int strStr(String hay, String need) {
        int n=hay.length();
        String s1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                s1=hay.substring(i,j);
                if(s1.equals(need)){
                    return i;
                }
            }
        }
        return -1;
    }
}
