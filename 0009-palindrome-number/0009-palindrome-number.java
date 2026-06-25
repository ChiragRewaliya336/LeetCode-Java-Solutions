class Solution {
    public boolean isPalindrome(int x) {
        int num =x;
        int rev =0;
        if(x<0){
            return false;
        }
        else{
            while(x>0){
                int lastdig = x % 10;
                rev = rev*10 + lastdig;
                x=x/10;
            }
        }
        if(num==rev){
            return true;
        }
        return false;
    }
}