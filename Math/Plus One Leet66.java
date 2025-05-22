class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry needed
            }
            digits[i] = 0; // Carry over
        }
        
        // If we reach here, all digits were 9 → result is 1 followed by n zeros
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
