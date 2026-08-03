class Solution {
     int dp[];
    int solve(int[] stoneValue, int i){
        int n = stoneValue.length;
        if(i>=n) return 0;
        if (dp[i] != Integer.MIN_VALUE)
        return dp[i];
        int result = Integer.MIN_VALUE;
        result = Math.max(result, stoneValue[i] - solve(stoneValue,i+1));
        if(i+1<n){
        result = Math.max(result, stoneValue[i] + stoneValue[i+1] - solve(stoneValue,i+2));
        }
        if(i+2<n){
        result = Math.max(result, stoneValue[i] + stoneValue[i+1] + stoneValue[i+2]-solve(stoneValue,i+3));
        }
        dp[i] = result;
        return dp[i];
    }
    public String stoneGameIII(int[] stoneValue) {
       
        dp = new int[stoneValue.length];
        Arrays.fill(dp, Integer.MIN_VALUE);
        int diff = solve(stoneValue, 0);
        if(diff<0) return "Bob";
        if(diff>0) return "Alice";
        else return "Tie";
    }
}