class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Set<List<Integer>> st = new HashSet<>();
        // int n = nums.length;

        // for (int i = 0; i < n; i++) {
        //     Set<Integer> tr = new HashSet<>();

        //     for (int j = i + 1; j < n; j++) {
        //         int third = -(nums[i] + nums[j]);

        //         if (tr.contains(third)) {
        //             List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
        //             Collections.sort(temp);
        //             st.add(temp);
        //         }
        //         tr.add(nums[j]);
        //     }
        // }

        // return new ArrayList<>(st);

        // optimal:
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                long sum = nums[i];
                sum += nums[j];
                sum +=nums[k];
                if(sum == 0){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j], nums[k]);
                    ans.add(temp);
                    k--; j++;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }

            }
        }
        return ans;
    }
}