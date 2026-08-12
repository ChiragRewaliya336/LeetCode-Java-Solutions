class Solution {
    public double myPow(double x, int n) {
        return power(x, (long)n);
    }
    public double power(double x, long n){
        if(n==1) return x;
        if(n==0) return 1;
        if(n<0){
            return 1/power(x, -n);
        }
        double call = power(x,n/2);
        if(n%2==0){
            return call*call;
        }
        else return x *call*call;
    }
}