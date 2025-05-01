class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int c=0;
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int max=arr.length*arr[0].length;
        List<Integer> l=new ArrayList<>();
        while(minr<=maxr&&minc<=maxc){
            //left to right
            for(int j=minc;j<=maxc;j++){
                l.add(arr[minr][j]);
                c++;
            }minr++;
            //top to bottom
            if(c>=max)break;
            for(int j=minr;j<=maxr;j++){
                l.add(arr[j][maxc]);
                c++;
            }maxc--;
            //right to left
             if(c>=max)break;
            for(int j=maxc;j>=minc;j--){
                l.add(arr[maxr][j]);
                c++;
            }maxr--;
            //bottom to top
            if(c>=max)break;
            for(int j=maxr;j>=minr;j--){
                l.add(arr[j][minc]);
                c++;
            }minc++;
        }
        return l;
    }
}
