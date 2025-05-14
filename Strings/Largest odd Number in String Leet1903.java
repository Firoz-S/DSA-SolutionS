class Solution {
    public String largestOddNumber(String num) {
        // Start from the end and find the first odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return ""; // No odd digit found
    }
}
