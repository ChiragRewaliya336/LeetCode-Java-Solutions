class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count =new int[51];
        for(int ele:nums){
            count[ele]++;
        }
        if(k==1){
           for(int i=50; i>=0; i--){
            if(count[i]==1) return i;
           }
        }
        if(k==nums.length){
            int ans =-1;
            for(int ele:nums){
                ans = Math.max(ans,ele);
            }
            return ans;
        }
        int max =-1;
        if(count[nums[0]]==1){
            max = Math.max(max,nums[0]);
        }
        if(count[nums[nums.length-1]]==1){
            max = Math.max(max,nums[nums.length-1]);
        }
        return max;
    }
}