class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        StringBuilder window = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));//String.valueOf() converts any data type to string.

            // If duplicate found, remove chars from start until it's gone
            if (window.toString().contains(ch)) {
                int index = window.indexOf(ch);
                window.delete(0, index + 1); // shrink from front
            }

            window.append(ch); // add new char to window
            maxLength = Math.max(maxLength, window.length());//change if windowlength is greater then maxlength
        }

        return maxLength;
    }
}
