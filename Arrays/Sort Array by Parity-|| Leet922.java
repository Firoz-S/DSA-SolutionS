class Solution {
    public int[] sortArrayByParityII(int[] A) {
        // int i=0;
        // int j=0;
        // for(i=0;i<nums.length;i++){
        //     if(i%2==0){
        //         if(nums[i]%2!=0){
        //             j=i+1;
        //             while(j<nums.length){
        //                 if(nums[j]%2==0){
        //                     int temp=nums[i];
        //                     nums[i]=nums[j];
        //                     nums[j]=temp;
        //                     break;
        //                 }
        //                 j++;
        //             }
        //         }
        //     }
        //     else{
        //         if(nums[i]%2==0){
        //             while(j<nums.length){
        //                 if(nums[j]%2!=0){
        //                     j=i+1;
        //                     int temp=nums[i];
        //                     nums[i]=nums[j];
        //                     nums[j]=temp;
        //                     break;
        //                 }
        //                 j++;
        //             }
        //         }
        //     }
        
        // }
        // return nums;
        int i = 0, j = 1, n = A.length;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(A, i, j);
            }
        }
        return A;
    }
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
