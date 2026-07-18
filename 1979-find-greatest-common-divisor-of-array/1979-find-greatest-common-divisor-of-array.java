class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length-1];
        // int ans =1;
        // for(int i =1; i<=large; i++){
        //     if(small % i==0 && large % i==0){
        //         ans= Math.max(ans, i);
        //     }
        // }
        // return ans;

        // Optimal:
        while(small != 0){
            int rem = large % small;
            large = small;
            small = rem ;
        }
        return large;
    }
}