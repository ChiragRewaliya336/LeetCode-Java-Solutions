class Solution {
    public int gcdOfOddEvenSums(int n) {
        int ans =1;
        for(int i =1; i<=n; i++){
            if( (n*n) %i ==0 && (n*(n+1)) %i ==0){
                ans =i;
            }
        }
        return ans;
    }
}