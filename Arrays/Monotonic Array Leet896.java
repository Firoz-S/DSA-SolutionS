class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        int c=0;
        int k=0;
        int j;
        while(i<nums.length-1){
            j=i+1;
            if(nums[i]<nums[j]){
                c++;
            }
            else if(nums[i]>nums[j]){
                k++;
            }

            i++;
        }
        if(k!=0 && c!=0){
            return false;
        }
        else{
            return true;
        }

    }
}
