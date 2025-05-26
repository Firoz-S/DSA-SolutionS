class Solution {
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int i=0;
        ArrayList<Integer> l=new ArrayList<>();
        while(i<n){
            if(nums[i]==i+1 || nums[i]==nums[nums[i]-1]) i++;
            else{
                swap(i,nums[i]-1,nums);
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) l.add(i+1);
        }
        return l;
    }
}
