class Solution {
    public int reverse(int x) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        int rem=0;
        int rev=0;
        while(x!=0){
            rem=x%10;
            if (rev > max / 10 || (rev == max / 10 && rem > 7)) return 0;
            if (rev < min / 10 || (rev == min / 10 && rem < -8)) return 0;
            rev=rev*10+rem;
            x=x/10;
        }
        return rev;
    }
}
