class Solution {
    public boolean stoneGameIX(int[] stones) {
        int t0=0, t1=0,t2=0;
        for(int x:stones){
            int check =x%3;
            if(check==0){
                t0++;
            }
            else if(check==1){
                t1++;
            }
            else t2++;
        }
        if(t0%2==0){
            return t1>=1 && t2>=1;
        }
        return t1-t2 >2 || t2-t1>2;
    }
}