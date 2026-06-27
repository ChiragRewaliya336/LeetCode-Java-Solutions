class Solution {
    public int majorityElement(int[] nums) { 
        int x = nums.length/2;
        int num =0;
        for(int i=0; i<nums.length; i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count ++;
                }
            }
            if(count>x){
                num = nums[i];
                break;
            }
        }
        return num;
    }
}