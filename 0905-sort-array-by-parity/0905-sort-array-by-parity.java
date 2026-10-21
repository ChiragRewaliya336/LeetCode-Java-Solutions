class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0; 
        int r= nums.length-1;
        int n = nums.length;
        if(n<=1) return nums;
        while(l<r){
            if(nums[l]%2==1 && nums[r]%2==0){
                int temp = nums[l];
                nums[l]=nums[r];
                nums[r]= temp;
                l++; r--;
            }
            else if(nums[l]%2==0){
                l++;
            }
            else{
                r--;
            }
        }
        return nums;
    }
}