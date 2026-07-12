class Solution {
    public int maxArea(int[] height) {
        // brute force:
        // int maxarea =0;
        // for(int i =0; i<height.length; i++){
            
        //     for(int j =i+1; j<height.length; j++){
        //         int heig= Math.min(height[i],height[j]);
        //        int  currar= heig*(j-i);
        //     maxarea = Math.max(maxarea,currar);
        //     }
        // }
        // return maxarea;

        int l = 0;
         int r = height.length-1;
         int ma = 0;
         while(l<=r){
            int curr =0;
            int hgt= Math.min(height[l],height[r]);
            int ara = hgt*(r-l);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
            ma = Math.max(ara,ma);
         }
         return ma;
    }
}