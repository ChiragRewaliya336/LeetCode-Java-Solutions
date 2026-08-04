class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
        // int small = nums[0];
        // int large = nums[nums.length-1];
        // ArrayList <Integer>ans = new ArrayList<>();
        // for(int i=0; i<nums.length-1;i++){
        //     if(nums[i+1]-nums[i]>1){
        //         for(int j= nums[i]+1; j<nums[i+1]; j++){
        //             ans.add(j);
        //         }
        //     }
        // }
        // return ans ;

        int min = 101;
        int max =0;
        Set<Integer> temp = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            min= Math.min(min, nums[i]);
            max= Math.max(max, nums[i]);
            temp.add(nums[i]);
        }
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i = min; i<=max; i++){
            if(!temp.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}