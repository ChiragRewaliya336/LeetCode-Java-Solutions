class Solution {
    public int[] twoSum(int[] num, int target) {
       int st =0;
       int ed = num.length-1;    
       while(st<=ed){
         int sum = num[st] + num[ed];
         if(sum==target){
            return new int []{st+1, ed+1};
         }
         else if(sum<target){
            st++;
         }
         else{
            ed--;
         }
       }
        return new int[]{-1, -1};
    }
}