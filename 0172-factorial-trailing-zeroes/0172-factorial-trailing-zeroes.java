class Solution {
    // int fact(int n){
    //     return n<=1 ? 1: n*fact(n-1);
    // }
    public int trailingZeroes(int n) {
        // int x =fact(n);
        // int count=0;
        // while(x>0){
        //     int last = x%10;
        //     if(last==0){
        //         count++;
        //     }
        //     else{
        //         break;
        //     }
        //     x /=10; 
        // }
        // return count;
        if(n<5){
            return 0;
        }
        return n/5 +trailingZeroes(n/5);
    }
}