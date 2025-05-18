class Solution {
    public String longestCommonPrefix(String[] strs) {
        //brute force approach:
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<strs[0].length();i++){
        char ch=strs[0].charAt(i);
        for(int j=1;j<strs.length;j++){
             if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                return sb.toString();
            }
        }
        sb.append(ch);
      }  
      return sb.toString();
      //optimal approach:
        // if (strs == null || strs.length == 0) return "";

        // String prefix = strs[0];  // start with the first word

        // for (int i = 1; i < strs.length; i++) {
        //     // Reduce the prefix until the current string starts with it
        //     while (!strs[i].startsWith(prefix)) {
        //         prefix = prefix.substring(0, prefix.length() - 1);
        //         if (prefix.isEmpty()) return "";
        //     }
        // }

        // return prefix;
    }
}
