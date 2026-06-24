class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Brute Force:
        // for(int i =0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }

        // Binary search:
        int row =matrix.length;
        int col = matrix[0].length;
        int i =0, j=row*col-1;
        while(i<=j){
            int mid =(i+j)/2;
            int rows = mid/col;
            int cols = mid%col;
            if(matrix[rows][cols]==target){
                return true;
            }
            else if(matrix[rows][cols]<target) i =mid+1;
            else j = mid-1;
        }
        return false;
    }
}