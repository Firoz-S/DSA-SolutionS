class Solution {
    public void moveZeroes(int[] nums) {
        // int j;
        // for(int i=0;i<nums.length;i++){
        //     j=i;
        //     while(j<nums.length){
        //       if(nums[j]==0){
        //          j++;
        //       }
        //       else{
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //         break;
        //       }
        //     }
        // }
        int nooz=0;
        for(int ele:nums){
            if(ele==0){
                nooz++;
            }
        }
        for(int i=0;i<nooz;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]==0){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
