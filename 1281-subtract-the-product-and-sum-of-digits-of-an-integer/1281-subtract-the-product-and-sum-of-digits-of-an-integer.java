class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int prod =1;
        int lastdig =0;
        int diff =0;
        while(n>0){
            lastdig = n%10;
            prod =prod *lastdig;
            sum =sum +lastdig;
            n=n/10;
        }
        diff= prod - sum ;
        return diff;
    }
}