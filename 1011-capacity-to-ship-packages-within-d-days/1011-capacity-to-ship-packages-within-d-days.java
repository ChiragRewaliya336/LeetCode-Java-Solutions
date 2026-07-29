class Solution {
    int daysused(int[] weights,int cap){
        int day =1;
        int load =0;
        for(int j =0; j<weights.length; j++){
            if(load + weights[j] <= cap){
                load += weights[j];
            }
            else{
                day++;
                load= weights[j];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        // brute force:
        // int st =0;
        // int ed=0;
        // int ans =0;
        // for(int i =0; i<weights.length; i++){
        //     st = Math.max(weights[i], st);
        //     ed += weights[i];
        // }
        // for(int i=st; st<=ed; i++){
        //     int load =0;
        //     int daysused =1;
        //     for(int j =0; j<weights.length; j++){
        //         int sum=weights[j];
        //         if(load + sum<=i){
        //             load += sum;
        //         }
        //         else{
        //             daysused++;
        //             load=sum;
        //         } 
        //     }
        //     if(daysused<=days){
        //         ans = i;
        //         break;
        //     }
        // }
        // return ans;

        // optimal:
        int low=0;
        int high=0;
        for(int i=0; i<weights.length; i++){
            low = Math.max(weights[i],low);
            high += weights[i];
        }
        int ans=0;
        while(low<=high){
            int mid = low +(high-low)/2;
            int day = daysused(weights,mid);
            if(day<=days){
                ans= mid;
                high= mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return ans;
    }
}