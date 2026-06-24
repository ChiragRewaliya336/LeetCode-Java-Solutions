class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Brute force:
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }

        // From top right:
        // int row =0 , col = matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col]==target){
        //         return true;
        //     }
        //     else if(target<matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row ++;
        //     }
        // }

        // From bottom left:
        int row = matrix.length-1, col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==target){
                return true;
            }
            else if(target<matrix[row][col]){
                row --;
            }
            else{
                col++;
            }
        }
        return false;
    }
}