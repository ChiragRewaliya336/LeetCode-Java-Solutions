class Solution {
    public int maxSubArray(int[] nums) {
        // Brute force:
        // int ms = Integer.MIN_VALUE;
        // for(int i =0; i<nums.length; i++){
        //     for(int j=i; j<nums.length; j++){
        //         int sum =0;
        //         for(int k =i; k<=j; k++){
        //             sum += nums[k];
        //             ms = Math.max(ms,sum);
        //         }
        //     }
        // }
        // return ms ;

        // Better:
        // int ms = Integer.MIN_VALUE;
        // for(int i =0; i<nums.length; i++){
        //         int sum =0;
        //     for(int j=i; j<nums.length; j++){
        //             sum += nums[j];
        //             ms = Math.max(ms,sum);
        //     }
        // }
        // return ms ;

        // Kadane algorithm:
         int cs=0; 
        int ms =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            cs=Math.max(nums[i],cs +nums[i]);
            ms = Math.max(cs,ms);
            if(cs<0){
                cs =0;
            }
        }
        return ms;
    }
}