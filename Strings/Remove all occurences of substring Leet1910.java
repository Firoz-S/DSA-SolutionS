class Solution {
    public String removeOccurrences(String s, String part) {
        if (!s.contains(part)) return s;
        int idx = s.indexOf(part);
        String newStr = s.substring(0, idx) + s.substring(idx + part.length());
        return removeOccurrences(newStr, part);
    }
}
