class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int lo = 0, hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] < 0) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        int neg = lo;
        lo = 0;
        hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= 0) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        int pos = n - lo;
        return Math.max(neg, pos);
    }
}