class Solution {
    static List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> sub(int i,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> lis=new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                lis.add(ans.get(j));
            }
            l.add(lis);
            return l;
        }
        else{
            sub(i+1,nums,ans);
            ans.add(nums[i]);
            sub(i+1,nums,ans);
        }
        ans.remove(ans.size()-1);
        return l;
    }
    public List<List<Integer>> subsets(int[] nums) {
        l=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        l=sub(0,nums,ans);
        return l;
    }
}
