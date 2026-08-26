class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for(int x: nums){
            if(temp.contains(x)){
                return true;
            }
            else{
                temp.add(x);
            }
        }
        return false;
    }
}