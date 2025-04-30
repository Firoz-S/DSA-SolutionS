class Solution {
    public int matrixSum(int[][] arr) {
        int score=0;
         for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            reverse(arr[i]); // reverse to descending
        }
        for(int i=0;i<arr[0].length;i++){
            int max=arr[0][i];
            for(int j=0;j<arr.length;j++){
                if(max<arr[j][i]){
                    max=arr[j][i];
                }
            }
            score+=max;
        }
        return score;
    }
    private void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
