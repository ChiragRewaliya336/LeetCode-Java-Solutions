class Solution {
    public int arrangeCoins(int n) {
        int row =1;
        while(row<=n){
            n -= row;
            row++;
        }
        return row -1;

    }

}