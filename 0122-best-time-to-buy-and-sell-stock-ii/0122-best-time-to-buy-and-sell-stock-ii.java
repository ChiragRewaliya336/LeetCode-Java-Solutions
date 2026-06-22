class Solution {
    public int maxProfit(int[] num) {
        int bp =Integer.MAX_VALUE;
        int currprofit;
        int totalprofit =0;
        for(int i=0; i<num.length; i++){
            if (bp<num[i]) {
                currprofit = num[i]-bp;        
                totalprofit = totalprofit + currprofit;
                bp = num[i];
            }
            else{
                bp= num[i];
            }
        }
        return totalprofit;
    }
}