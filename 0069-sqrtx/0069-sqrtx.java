class Solution {
    public int mySqrt(int x) {
       long low =0;
       long high =x;
       long mid =0;
       long ans=0;
       if(x==1){
        return 1;
       }
       while(low<=high){
         mid = (high + low)/2;
         if(mid*mid==x){
            return (int)mid;
         }
         else if(mid*mid > x){
            high = mid -1;
         }
         else{
           ans =mid;
            low = mid +1;
         }
       } 
        return (int)ans;
       
    }
}