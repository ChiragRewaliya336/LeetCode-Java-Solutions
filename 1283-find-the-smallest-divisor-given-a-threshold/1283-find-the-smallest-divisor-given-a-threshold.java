class Solution {
    int sum(int[] nums, int mid){
        int sumo =0;
        for(int i=0; i<nums.length; i++){
            sumo += (nums[i]+mid-1)/mid; 
        }
        return sumo;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        // Brute force:
        // int max =0;
        int n = nums.length;
        // int ans=0;
        // for(int i=0; i<n; i++){
        //     max = Math.max(nums[i],max);
        // }
        // for(int i=1; i<=max; i++){
        //     int sum =0;
        //     for(int j=0;j<n; j++){
        //         int val = (nums[j]+i-1)/i;
        //         sum += val;
        //     }
        //     if(sum<=threshold){
        //         ans= i;
        //         break;
        //     }
        // }
        // return ans;

        // Optimal:
        int low =1;
        int high=0;
        for(int i=0; i<n; i++){
            high = Math.max(high, nums[i]);
        }
        int ans =0;
        while(low<=high){
            int mid = low + (high-low)/2;
            int check = sum(nums,mid);
            if(check<=threshold){
                ans=mid;
                high = mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return ans;
    }
}