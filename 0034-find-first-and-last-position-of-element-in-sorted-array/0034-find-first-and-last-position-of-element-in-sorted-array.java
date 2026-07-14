class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st =0;
        int end = nums.length-1;
        int first = -1;
        while(st<=end){
            // for first occurence:
            int mid = (st+end)/2;
            if(nums[mid]== target){
                first = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                st = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        st = 0;
        end = nums.length - 1;
        int last = -1;
        while(st<=end){
            // for last occurence:
            int mid = (st+end)/2;
            if(nums[mid]== target){
                last = mid;
                st = mid+1;
            }
            else if(nums[mid]<target){
                st = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return new int[]{first,last};
    }
}