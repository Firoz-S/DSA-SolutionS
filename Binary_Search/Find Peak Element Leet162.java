class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        if(arr.length==1) return n-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid+1]){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
}
