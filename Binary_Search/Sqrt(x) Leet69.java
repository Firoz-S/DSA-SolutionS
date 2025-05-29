class Solution {
    public int mySqrt(int x) {
        long lo=0;
        long high=x;
        while(lo<=high){
            long mid=(lo+high)/2;
            if(mid*mid==(long)x) return (int)mid;
            else if(mid*mid>(long)x) high=mid-1;
            else if(mid*mid<(long)x) lo=mid+1;
        }
        return (int)high;
    }
}
