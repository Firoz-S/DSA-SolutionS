class Solution {
    public int maxProduct(int n) {
                char[] s = String.valueOf(n).toCharArray();
        Arrays.sort(s);
        return (s[s.length - 1] - '0') * (s[s.length - 2] - '0');
    }
}
