class Solution {
    public int singleNumber(int[] nums) {
        int num=0;
        if(nums.length==1){
            num=nums[0];
            return num;
        }
        Arrays.sort(nums);
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                i=i+2;
                j=i+1;
            }
            else{
                num=nums[i];
                return num;
            }
        }
        num=nums[j-1];
        return num;
    }
}
