class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!temp.containsKey(nums[i])){
                temp.put(nums[i],i);
            }
            else{
                int pI= temp.get(nums[i]);
                if(Math.abs(pI-i)<=k) return true;
                else{
                    temp.put(nums[i],i);
                }
            }
        }
        return false;
    }
}