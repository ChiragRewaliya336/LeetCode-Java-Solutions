class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        Set<Integer> temp = new HashSet<>();
        for(int i=0; i<n; i++){
            temp.add(nums[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(!temp.contains(i)){
                ans.add(i);
            }
        }
        return ans ;
        
    }
}