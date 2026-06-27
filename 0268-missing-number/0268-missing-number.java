class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalsum = (n*(n+1))/2;
        int currsum =0;
        for(int i=0; i<n; i++){
            currsum += nums[i];
        }
        int miss = totalsum - currsum;
        return miss;
    }
}