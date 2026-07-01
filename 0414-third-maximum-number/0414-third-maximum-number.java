class Solution {
    public int thirdMax(int[] nums) {
    long largest = nums[0];
    long secondLargestElement =Long.MIN_VALUE;
    long thirdLargestElement = Long.MIN_VALUE;
    for(int i =0; i<nums.length; i++){
            if(nums[i]==largest){
                continue;
            }
        if(nums[i]>largest){
            thirdLargestElement = secondLargestElement;
            secondLargestElement=largest;
            largest = nums[i];
        }
            if(nums[i]==secondLargestElement){
                continue;
            }
         if(nums[i]<largest && nums[i]>secondLargestElement){
            thirdLargestElement = secondLargestElement;
            secondLargestElement =nums[i];
        }
            if(nums[i]==thirdLargestElement){
                continue;
            }
        if(nums[i]<secondLargestElement && nums[i]>thirdLargestElement){
            thirdLargestElement =nums[i];
        }
    }
         if(thirdLargestElement == Long.MIN_VALUE){
             return (int)largest;
         }
        return (int)thirdLargestElement;
    }
}