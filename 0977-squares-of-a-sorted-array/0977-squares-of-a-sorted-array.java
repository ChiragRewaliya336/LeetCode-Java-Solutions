class Solution {
    public int[] sortedSquares(int[] nums) {
      int st =0;
      int end =nums.length-1;
      int idk =end;
      int num [] =new int[nums.length];
      while(st<=end){
        int sqst = nums[st]* nums[st];
        int sqed =nums[end]*nums[end];
        if(sqst<sqed){
            num[idk]=sqed;
            end--;
            idk--;
        }
        else{
            num[idk]=sqst;
            st++;
            idk--;
        }
      }
      return num;  
    }
}