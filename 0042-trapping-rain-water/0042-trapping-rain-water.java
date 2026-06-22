class Solution {
    public int trap(int[] height) {
         int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        // calculate right max boundary =array
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trapped =0;
        //loop
        for(int i =0; i<height.length;i++){
            //waterlvel min(left max, right max)
            int waterlevel =Math.min(leftmax[i],rightmax[i]);
            // trappped water =(waterlevel-height)*width
            trapped += waterlevel-height[i];
        }
        return trapped;
    }
}