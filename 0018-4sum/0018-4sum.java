class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // int n = nums.length;
        // HashSet<List<Integer>> st = new HashSet<>();
        // for(int i =0; i<n; i++){
        //     for(int j= i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             for(int l =k+1; l<n; l++){
        //                 long sum= nums[i]+nums[j];
        //                 sum += nums[k];
        //                 sum += nums[l];
        //                 if(sum==target){
        //                     List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k],   nums[l]);
        //                     Collections.sort(temp);
        //                     st.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;


        // better:
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                Set<Integer> tr = new HashSet<>();
                for(int k =j+1; k<n; k++){
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long four = (long) target - sum;
                    if (four >= Integer.MIN_VALUE && four <= Integer.MAX_VALUE) {
                        if(tr.contains((int)four)){
                            List<Integer> temp = Arrays.asList(nums[i],nums[j], nums[k], (int)four);
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
                    tr.add(nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}