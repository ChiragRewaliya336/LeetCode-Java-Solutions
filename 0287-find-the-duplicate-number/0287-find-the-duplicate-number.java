class Solution {
    public int findDuplicate(int[] nums) {
        int ans =0;
        // for(int i =0; i<nums.length; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i]== nums[j]){
        //             ans =nums[i];
        //             break;
        //         }
        //     }
        // }
        // return ans;
        HashMap<Integer,Integer>temp = new HashMap<>();
        for(int x : nums){
            if(temp.containsKey(x)){
                temp.put(x,temp.get(x)+1);
                ans =x;
                break;
            }
            else{
                temp.put(x,1);
            }
        }
        return ans;
    }
}