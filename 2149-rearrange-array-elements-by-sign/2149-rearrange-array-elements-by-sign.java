class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Brute Force:
        // int pos[] = new int[nums.length/2];
        // int p=0;
        // int neg[] = new int[nums.length/2];
        // int n =0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]>0){
        //         pos[p] = nums[i];
        //         p++;
        //     }
        //     if(nums[i]<0){
        //         neg[n] = nums[i];
        //         n++;
        //     } 
        // }
        // for(int i =0; i<pos.length; i++){
        //     nums[2*i]= pos[i];
        //     nums[(2*i) + 1] = neg[i];
        // }
        // return nums;

        // Optimal code:
        int ans[] = new int[nums.length];
        int n = nums.length;
        int posind =0;
        int negind=1;
        for(int i=0; i<n; i++){
            if(nums[i]<0){
                ans[negind] = nums[i];
                negind += 2;
            }
            else{
                ans[posind] = nums[i];
                posind +=2;
            }
        }
        return ans;
    }
}