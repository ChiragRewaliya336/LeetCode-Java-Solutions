class Solution {
    public int maxArea(int[] height) {
        // Brute fore:
        // int maxarea = Integer.MIN_VALUE;
        // for(int i=0; i<height.length; i++){
        //     for(int j=i+1;j<height.length; j++){
        //         int ht = Math.min(height[i], height[j]);
        //         int curr = ht*(j-i);
        //         maxarea = Math.max(curr, maxarea);
        //     }
        // }
        // return maxarea;

        // Optimal:
        int l = 0;
        int r = height.length-1;
        int ma=0;
        while(l<=r){
            int ht = Math.min(height[l], height[r]);
            int curr = ht *(r-l);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
            ma = Math.max(curr, ma);
        }
        return ma;
    }
}