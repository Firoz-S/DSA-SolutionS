class Solution {
    public void rotate(int[][] arr) {
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[0].length-1;j>i;j--){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];     //transposing the 2d array
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            int a=0;
            int b=arr[0].length-1;
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];    //reversing the array
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
    }
}
