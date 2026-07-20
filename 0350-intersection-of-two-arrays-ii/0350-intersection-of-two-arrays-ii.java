class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Brute force:
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums2.length];
        for(int i=0; i<nums1.length; i++){
            for(int j =0; j<nums2.length; j++){
                if(nums1[i] == nums2[j] && !visited[j]){
                    visited[j] = true;
                    temp.add(nums2[j]);
                    break;
                }
            }
        }
        int ans[] = new int[temp.size()];
        for(int i =0; i<temp.size(); i++){
            ans[i]= temp.get(i);
        }
        return ans;
    }
}