class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int nums[]) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int m = (1<<n);
        for(int i = 0; i<m; i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j = 0; j<n; j++){
                if((i>>j)%2 == 1) {
                    a.add(nums[j]);
                }
            }
            ans.add(a);
        }
        return ans;
    }
}