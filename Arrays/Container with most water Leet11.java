class Solution {
    public int maxArea(int[] h) {
        int i=0;
        int j=h.length-1;
        int max=0;
        while(i<j){
            if(h[i]<h[j]){
                if(max<h[i]*(j-i)) max=h[i]*(j-i);
                i++;
            }
            else if(h[i]>h[j]){
                if(max<h[j]*(j-i)) max=h[j]*(j-i);
                j--;
            }
            else{
                if(max<h[i]*(j-i)) max=h[i]*(j-i);
                i++;
            }
        }
        return max;
    }
}
