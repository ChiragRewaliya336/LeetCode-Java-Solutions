class Solution {
    int maxscore(int i, int j, int turn, int[] nums){
        if(i>j) return 0;
        if(turn==0){
            int s1 = nums[i] + maxscore(i+1, j,1, nums);
            int s2 = nums[j] + maxscore(i, j-1,1, nums);
            return Math.max(s1,s2);
        }
        else{
            int s1 = maxscore(i+1,j,0,nums);
            int s2 = maxscore(i,j-1,0,nums);
            return Math.min(s1,s2);
        }
    } 
    public boolean predictTheWinner(int[] nums) {
        int s1 = maxscore(0, nums.length-1,0,nums);
        int ttlsm = 0;
        for(int i=0; i<nums.length; i++){
            ttlsm += nums[i];
        }
        int s2 = ttlsm - s1;
        if(s1>=s2){
            return true;
        }
        else return false;
    }
}