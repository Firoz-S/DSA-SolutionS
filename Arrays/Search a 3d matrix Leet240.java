class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        // int c=0;
        // int i=0;
        // int j=0;
        // while(i<arr.length){
        //     if(arr[0][j]>target){
        //         break;
        //     }
        //     i++;
        // }
        //  while(j<arr[0].length){
        //     if(arr[0][j]>target){      brute force(own approach)
        //         break;
        //     }
        //     j++;
        // }
        // for(int k=0;k<i;k++){
        //     for(int l=0;l<j;l++){
        //         if(arr[k][l]==target){
        //             c++;
        //             break;
        //         }
        //     }
        // }
        // if(c!=0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        int m=arr.length;
        int n=arr[0].length;
        int row=0;
        int c=0;
        int col=n-1;
        while(row<m && col>=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
    return false;
    }
}
