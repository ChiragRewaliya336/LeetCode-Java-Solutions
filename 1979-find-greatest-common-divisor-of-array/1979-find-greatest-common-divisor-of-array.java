class Solution {
    public int findGCD(int[] nums) {
        // int small = nums[0];
        // int large = nums[nums.length-1];
        // Arrays.sort(nums);
        // int ans =1;
        // for(int i =1; i<=large; i++){
        //     if(small % i==0 && large % i==0){
        //         ans= Math.max(ans, i);
        //     }
        // }
        // return ans;

        // Optimal:
        int small= Integer.MAX_VALUE;
        int large= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(large<nums[i]){
                large = nums[i];
            }
            if(small>nums[i]){
                small = nums[i];
            }
        }
        while(small != 0){
            int rem = large % small;
            large = small;
            small = rem ;
        }
        return large;
    }
}