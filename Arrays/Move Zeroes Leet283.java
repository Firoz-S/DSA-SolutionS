class Solution {
    public void moveZeroes(int[] nums) {
        int j;
        for(int i=0;i<nums.length;i++){
            j=i;
            while(j<nums.length){
              if(nums[j]==0){
                 j++;
              }
              else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                break;
              }
            }
        }
    }
}
