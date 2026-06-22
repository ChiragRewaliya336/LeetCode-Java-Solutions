class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int sum = 0;
      int maxsum = 0;
      for(int i = 0; i<nums.length; i++){
        if(nums[i] == 1) {
            sum = sum + nums[i];
        }
        else{
            sum = 0;
        }
        maxsum = Math.max(sum, maxsum);
      }  
      return maxsum;
    }
}