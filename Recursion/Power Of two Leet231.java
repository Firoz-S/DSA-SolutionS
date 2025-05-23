class Solution {
    public boolean isPowerOfTwo(int n) {
        // Base cases
        if (n == 1) return true;     // 2^0 = 1
        if (n <= 0 || n % 2 != 0) return false; // Not power of two

        // Recursive step
        return isPowerOfTwo(n / 2);
    }
}
