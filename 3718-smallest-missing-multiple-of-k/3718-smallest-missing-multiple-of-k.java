class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> temp = new HashSet<>();
        int ans =0;
        for(int x:nums){
            temp.add(x);
        }
        for(int i=k; i<=k*(nums.length+1); i +=k){
            if(!temp.contains(i)){
                ans =i;
                break;
            }
        }
        return ans ;
    }
}