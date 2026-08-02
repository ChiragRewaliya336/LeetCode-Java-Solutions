class Solution {
    int solve(int i, int j, int[] piles,Integer[][] dp){
        if(i>j) return 0;
        if(dp[i][j] != null) return dp[i][j];
        int take_i = piles[i] + Math.min(solve(i+2, j,piles,dp),solve(i+1,j-1,piles,dp)); 
        int take_j = piles[j] + Math.min(solve(i, j-2,piles,dp), solve(i+1,j-1,piles,dp)); 
        dp[i][j] = Math.max(take_i,take_j);
        return dp[i][j];
    }
    public boolean stoneGame(int[] piles) {
        int sum=0;
        for(int i=0; i<piles.length; i++){
            sum += piles[i];
        }
        Integer[][] dp = new Integer[piles.length][piles.length];
        int alscore= solve(0,piles.length-1,piles,dp);
        if(alscore>sum/2){
            return true;
        }
        else return false;

        // Extreme Optimal:
        // return true;
    }
}