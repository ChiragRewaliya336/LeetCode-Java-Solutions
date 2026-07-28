class Solution {
    public int [] merge(int[] nums1, int m, int[] nums2, int n) {
        // int ans[] = new int[m + n];
        // for (int i = 0; i < m; i++) {
        //     ans[i] = nums1[i];
        // }
        // for (int i = 0; i < n; i++) {
        //     ans[i + m] = nums2[i];
        // }
        // Arrays.sort(ans);
        // for(int i=0; i<ans.length; i++){
        //     nums1[i]= ans[i];
        // }
        // return nums1;

        // Better:
        // for(int i=0; i<nums2.length; i++){
        //     nums1[m+i] = nums2[i];
        // }
        // Arrays.sort(nums1);
        // return nums1;
        
        // Optimal:
        int left = m-1; 
        int right= n-1;
        int idk =nums1.length-1;
        while(left>=0 && right>=0){
            if(nums1[left]<nums2[right]){
                nums1[idk]= nums2[right];
                right--;
                idk--;
            }
            else if(nums1[left]>=nums2[right]){
                nums1[idk]= nums1[left];
                left--;
                idk--;
            }
        }
        while(right>=0){
            nums1[idk]=nums2[right];
            right--;
            idk--;
        }
        return nums1;
    }
}