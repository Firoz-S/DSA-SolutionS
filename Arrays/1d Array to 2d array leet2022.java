class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        int[][] ans=new int[m][n];
        int[][] ans1=new int[0][0];
        int l=arr.length;
        int k=0;
        if(m*n!=l){
            return ans1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    ans[i][j]=arr[k++];
            }
        }
         return ans;
    }
}
