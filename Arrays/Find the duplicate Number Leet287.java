class Solution {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int findDuplicate(int[] nums) {
        while(true){
                if(nums[0]!=nums[nums[0]]){
                    swap(0,nums[0],nums);
                }
                else{
                    break;
                }
        }
        return nums[0];
    }
}
