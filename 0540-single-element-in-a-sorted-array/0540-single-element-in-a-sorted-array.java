class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i =0;
        int j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                i +=2;
                j +=2;
            }
            else{
                break;
            }
        }
        return nums[i];
    }
}