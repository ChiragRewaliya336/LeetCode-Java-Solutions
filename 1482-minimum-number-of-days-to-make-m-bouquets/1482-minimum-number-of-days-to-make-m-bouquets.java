class Solution {
    int makeday(int[] bloomDay, int bouquet, int k,int mid){
        int count =0;
        for(int j=0; j<bloomDay.length; j++){
            if(bloomDay[j]<=mid){
                if(count<k){
                    count++;
                }
                if(count==k){
                    bouquet++;
                    count =0;
                    }
            }
            else{
                count =0;
            }
        }
        return bouquet;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int minday=Integer.MAX_VALUE;
        int maxday=0;
        int n = bloomDay.length;
        for(int i=0; i<n; i++){
            minday= Math.min(minday,bloomDay[i]);
            maxday= Math.max(maxday,bloomDay[i]);
        }
        // if((long)m*k <= n){
        //     for(int day= minday; day<=maxday; day++){
        //         int count =0;
        //         int bouquet=0;
        //         for(int j =0; j<n; j++){
        //             if(bloomDay[j]<=day){
        //                 if(count<k){
        //                     count++;
        //                 }
        //                 if(count==k){
        //                     bouquet++;
        //                     count =0;
        //                 }
        //             }
        //             else{
        //                 count =0;
        //             }
        //         }
        //         if(bouquet>=m){
        //             return day;
        //         }
        //     }
        // }
        // return -1;

        //Optimal sln:
        int low= minday;
        int high= maxday;
        if((long)m*k>n){
            return -1;
        }
        while(low<high){
            int mid = low +(high-low)/2;
            int bouquet=0;
            int bouquets = makeday(bloomDay,bouquet,k,mid);
            if(bouquets>=m){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}