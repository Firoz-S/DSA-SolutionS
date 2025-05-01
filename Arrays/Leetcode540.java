class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(i==nums.length-1){
                break;
            }
            if(i+1 <nums.length && nums[i]!=nums[i+1]){
                break;
            }
            i=i+2;
        }
        return nums[i];
    }
}
