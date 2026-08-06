class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max = arr[arr.length-1];
        int count =0;
        Set<Integer> temp  = new HashSet<>(); 
        for(int num: arr){
            temp.add(num);
        }
        for(int i=1; i<= max; i++){
            if(!temp.contains(i)){
                count++;
            }
            if(count == k){
                return i;
            }
        }
        return arr[arr.length-1] +(k-count);
    }
}