class Solution {
    public int singleNonDuplicate(int[] nums) {
    //     int i =0;
    //     int j =1;
    //     while(j<nums.length){
    //         if(nums[i]==nums[j]){
    //             i +=2;
    //             j +=2;
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     return nums[i];
    // }
    int low =0;
    int high = nums.length-1;
    while(low<high){
         int mid = low + (high-low)/2;
         if(mid%2==1){
            mid--;
         }
        if(nums[mid]==nums[mid+1]){
            //right
            low = mid +2;
        }
        else{
            high = mid;
        }
    }
    return nums[low];
}
}