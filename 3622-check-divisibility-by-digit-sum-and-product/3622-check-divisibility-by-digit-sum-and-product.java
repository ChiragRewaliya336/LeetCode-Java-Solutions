class Solution {
    public boolean checkDivisibility(int n) {
        int check =n;
        int currentsum =0;
        int prod = 1;
        while(n>0){
            int lastdigit = n%10;
            currentsum += lastdigit;
            prod *= lastdigit;
            n /=10;
        }
        int totalsum = currentsum + prod;
        if(check % totalsum==0){
            return true;
        }
        else return false;
    }
}