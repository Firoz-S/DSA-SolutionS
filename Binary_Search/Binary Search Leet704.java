class Solution {
    public int search(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int c=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]==target){
                c=mid;
                break;
            }
        }
        if(c!=-1){
            return c;
        }
        else{
            return -1;
        }
    }
}
