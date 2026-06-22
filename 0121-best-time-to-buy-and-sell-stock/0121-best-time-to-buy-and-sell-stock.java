class Solution {
    public int maxProfit(int[] num) {
         int bp =Integer.MAX_VALUE;
        int currprofit;
        int maxprofit=0;
        for(int i=0; i<num.length; i++){
            if (bp<num[i]) {
                currprofit = num[i]-bp;
                maxprofit = Math.max(maxprofit, currprofit);
            }
            else{
                bp= num[i];
            }
        }
        return maxprofit;
    }
}