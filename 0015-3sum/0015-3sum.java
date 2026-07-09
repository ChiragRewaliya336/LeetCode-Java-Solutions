class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> tr = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);

                if (tr.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    st.add(temp);
                }

                tr.add(nums[j]);
            }
        }

        return new ArrayList<>(st);
    }
}