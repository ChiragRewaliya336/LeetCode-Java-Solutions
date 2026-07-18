class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>temp= new HashSet<>();
        for(int x : nums2){
            temp.add(x);
        }
        HashSet<Integer>ans = new HashSet<>();
        for(int i =0; i<nums1.length;i++){
            if(temp.contains(nums1[i])){
                ans.add(nums1[i]);
            }
        } 
        int fin[] = new int[ans.size()];
        int idx =0;
        for(int x: ans){
            fin[idx] = x;
            idx++;
        }
        return fin;
    }
}