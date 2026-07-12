class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int newarr[] = arr.clone();
        HashMap<Integer,Integer> hasm = new HashMap<>();
        Arrays.sort(newarr);
        int rank =1;
        for(int i =0; i<newarr.length; i++){
            if(i==0){
                hasm.put(newarr[i], rank);
            }
            else if(newarr[i]==newarr[i-1]){

            }
            else{
                rank++;
            }
            hasm.put(newarr[i], rank);
        }
        int ans[] = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            ans[i]= hasm.get(arr[i]);   
        }
        return ans;
    }
}