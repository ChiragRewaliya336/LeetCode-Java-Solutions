class Solution {
    public int[] rotate(int[] num, int k) {
         k = k % num.length;
        int st =0;
        int ed =num.length-1;
        while (st<ed) {
            int temp =num[st];
            num[st] =num[ed];
            num[ed]=temp;
            st++;
            ed--;
        }
        st =0;
        ed = k-1;
        while (st<ed) {
            int temp =num[st];
            num[st] =num[ed];
            num[ed]=temp;
            st++;
            ed--;
        }
        st =k;
        ed = num.length-1;
        while (st<ed) {
            int temp =num[st];
            num[st] =num[ed];
            num[ed]=temp;
            st++;
            ed--;
        }
        
        return num;
    }
}