class Solution {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] findErrorNums(int[] nums) {
        int[] a=new int[2];
       int n=nums.length;
       int i=0;
       while(i<n){
        if(nums[i]==i+1||nums[i]==nums[nums[i]-1]) i++;
        else{
            swap(i,nums[i]-1,nums);
        }
       }
       for(i=0;i<n;i++){
        if(nums[i]!=i+1){
            a[0]=nums[i];
            a[1]=i+1;
            break;
        }
       }
       return a;
    }
} 
    
