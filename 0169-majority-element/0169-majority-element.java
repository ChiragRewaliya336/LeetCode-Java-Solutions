class Solution {
    public int majorityElement(int[] nums) { 
        int x = nums.length/2;
        // brute force:
        // int num =0;
        // for(int i=0; i<nums.length; i++){
        //     int count =0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[i]==nums[j]){
        //             count ++;
        //         }
        //     }
        //     if(count>x){
        //         num = nums[i];
        //         break;
        //     }
        // }
        // return num;
        
        // Better:
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key:map.keySet()){
            if(map.get(key)>x){
                return key;
            }
        }
        return -1;
    }
}