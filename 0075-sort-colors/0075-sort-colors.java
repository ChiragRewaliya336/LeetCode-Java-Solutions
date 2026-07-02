class Solution {
    public void sortColors(int[] nums) {
        // Brute force:
        // int c0 =0;
        // int c1=0;
        // int c2=0;
        // for(int i =0; i<nums.length; i++){
        //     if(nums[i]==0) c0++;
        //     if(nums[i]==1) c1++;
        //     if(nums[i]==2) c2++;
        // }
        // for(int i=0; i<c0; i++){
        //     nums[i] =0;
        // }
        // for(int i=c0; i<c0+c1; i++){
        //     nums[i] =1;
        // }
        // for(int i=c0+c1; i<c0+c1+c2; i++){
        //     nums[i] =2;
        // }
      
    //Optimal solution:
    int mid =0, low=0, high =nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }    
    }
}