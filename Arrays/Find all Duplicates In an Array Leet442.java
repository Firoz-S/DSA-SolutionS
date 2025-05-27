class Solution {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        List<Integer> l=new ArrayList<>();
        while(i<n){
            if(nums[i]==i+1||nums[i]==nums[nums[i]-1]) i++;
            else{
                swap(i,nums[i]-1,nums);
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) l.add(nums[i]);
        }
        return l;
    }
}
