class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=n-1;
        int c=0;
        int i=1;
        while(minr<= maxr && minc<= maxc){
            for(int j=minc;j<=maxc;j++){
                arr[minr][j]=i;
                i++;
                c++;
            }minr++;
            if(c>=n*n)break;
            for(int j=minr;j<=maxr;j++){
                arr[j][maxc]=i;
                i++;
                c++;
            }maxc--;
            for(int j=maxc;j>=minc;j--){
                arr[maxr][j]=i;
                i++;
                c++;
            }maxr--;
            for(int j=maxr;j>=minr;j--){
                arr[j][minc]=i;
                i++;
                c++;
            }minc++;
        } 
        return arr;
    }
}
