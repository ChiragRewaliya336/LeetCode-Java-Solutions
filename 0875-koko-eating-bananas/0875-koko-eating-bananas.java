class Solution {
    int findmax(int[] piles){
        int max =piles[0];
        for(int i =0; i<piles.length; i++){
            max = Math.max(piles[i],max);
        }
        return  max;
    }
    long calculatehrs(int[] piles, int hours){
        long tthr = 0;
        for(int i=0; i<piles.length; i++){
            tthr += (piles[i]+hours-1)/hours;
        }
        return tthr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        // Brute force:
        // int ans =0;
        // int k = 0;
        // for(int i =0; i<piles.length; i++){
        //     k = Math.max(k, piles[i]);
        // }
        // for(int i =1; i<=k; i++){
        //     long ttlhrs = 0;
        //     for(int j =0; j<piles.length; j++){
        //        long hrs= (piles[j]+i -1)/i;
        //         ttlhrs += hrs;
        //     }
        //     if(ttlhrs <=h){
        //         ans=i;
        //         break;
        //     }
        // }
        // return ans;

        // Optimal approach:
        int low=1; int high = findmax(piles);
        while(low<=high){
            int mid = low + (high-low)/2;
            long ttlhrs= calculatehrs(piles, mid);
            if(ttlhrs<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}