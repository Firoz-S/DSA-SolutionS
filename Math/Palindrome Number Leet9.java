class Solution {
    public boolean isPalindrome(int i) {
        int rem=0;
        int rev=0;
        int x=i;
        if(x<0){
            return false;
        }
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(i==rev){
            return true;
        }
        else{
            return false;
        }
    }
}
