class Solution {
    public int countDigits(int num) {
        int count =0;
        int check=num;
        while(num>0){
            int last = num%10;
            if(check%last==0){
                count++;
            }
            num /=10;
        }
        return count;
    }
}