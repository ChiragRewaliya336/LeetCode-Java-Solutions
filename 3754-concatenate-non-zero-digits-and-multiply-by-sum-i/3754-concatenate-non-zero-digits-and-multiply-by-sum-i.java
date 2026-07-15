class Solution {
    public long sumAndMultiply(int n) {
        int sum =0;
        int no =0;
        while(n>0){
            int lastdig = n%10;
            if(lastdig !=0){
                sum += lastdig;
                no = (no*10) + lastdig;
            }
                n=n/10;
        }
        int num =0;
        while(no>0){
            int lastdig= no%10;
            num = (num*10) +lastdig;
            no = no/10;
        }
        return (long)sum *num;
    }
}