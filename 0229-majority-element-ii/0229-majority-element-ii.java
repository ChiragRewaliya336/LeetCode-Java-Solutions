class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Bruet force: 
        // List<Integer> ans =new ArrayList<>();
        // for(int i=0; i<nums.length; i++){
        //     if(ans.size()==0 ||  !ans.contains(nums[i]) ){
        //         int count =0;
        //         for(int j =0; j<nums.length; j++){
        //             if(nums[j]==nums[i]){
        //                 count ++;
        //             }
        //         }
        //         if(count>nums.length/3){
        //             ans.add(nums[i]);
        //         }
        //         if(ans.size()==2){
        //             break;
        //         }
        //     }
        // }
        // return ans;
        int n = nums.length;
        HashMap<Integer, Integer> check = new HashMap<>();
        List<Integer> is = new ArrayList<>();
        int min = (n/3)+1;
        for(int i=0; i<n; i++){
            check.put(nums[i], check.getOrDefault(nums[i], 0) +1);
            if(check.get(nums[i])==min){
                is.add(nums[i]);
            }
            if(is.size()==2){
                break;
            }
        }
        Collections.sort(is);
        return is;
    }
}