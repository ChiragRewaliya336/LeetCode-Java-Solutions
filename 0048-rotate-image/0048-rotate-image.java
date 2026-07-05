class Solution {
    public void rotate(int[][] matrix) {
        // Brute force:
        // int ans[][] = new int [matrix.length][matrix[0].length];
        // for(int i =0; i<matrix.length; i++){
        //     for(j=0; j<matrix[0].length; j++){
        //         ans[j][matrix.length -1-i] = matrix[i][j];
        //     }
        // }
        // return ans;

        for(int i=0; i<matrix.length-1; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        //reverse:
        for(int i=0; i<matrix.length; i++){
            int left =0, right =matrix.length-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right]= temp;
                left++;
                right--;
            }
        }
    }
}