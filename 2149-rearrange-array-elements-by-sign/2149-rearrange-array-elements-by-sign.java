class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length/2];
        int p=0;
        int neg[] = new int[nums.length/2];
        int n =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                pos[p] = nums[i];
                p++;
            }
            if(nums[i]<0){
                neg[n] = nums[i];
                n++;
            } 
        }
        for(int i =0; i<pos.length; i++){
            nums[2*i]= pos[i];
            nums[(2*i) + 1] = neg[i];
        }
        return nums;
    }
}