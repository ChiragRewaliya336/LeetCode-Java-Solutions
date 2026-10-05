class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int lo = 0;
        int hi = arr.length - 1;
        int ans = 0;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (mid > 0 && mid < arr.length - 1 &&
                arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {

                ans = mid;
                break;
            }
            else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return ans;
    }
}