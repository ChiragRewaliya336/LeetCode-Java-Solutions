class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[high]){
                // right mein hai
                min = Math.min(min, nums[mid]);
                low = mid +1;
            }
            else if(nums[mid]<nums[high]){
                // left 
                min = Math.min(min, nums[mid]);
                high = mid-1;
            }
            else{
               min = Math.min(min, nums[mid]);
                high--;
            }
        }
        return min;
    }
}