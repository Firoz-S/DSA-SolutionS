class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        int[] freq=new int[128];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            freq[ascii]++;
        }

        for(int k=0;k<s.length();k++){
            int max=0;
            int j=0;
            int ind=0;
            char maxchar=0;
            for(int l=0;l<128;l++){
                if(max<freq[l] ){
                    ind=l;
                    max=freq[l];
                   maxchar=(char)l;
                }
            }
            if (ind == 0) break;
            freq[ind]=0;
            while(j<max){
                sb.append(maxchar);
                j++;
            }
        }
        return sb.toString();
    }
}
