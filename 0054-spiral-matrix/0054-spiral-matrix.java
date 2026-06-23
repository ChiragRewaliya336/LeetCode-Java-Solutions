import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int strow=0;
      int edrow= matrix.length-1;
      int stcol=0;
      int edcol=matrix[0].length-1;
      List<Integer> ans = new ArrayList<>();
      while(strow<=edrow && stcol<=edcol){
        //top:
        for(int j=stcol; j<=edcol; j++){
            ans.add(matrix[strow][j]);
        }
        //right:
        for(int i=strow+1; i<=edrow; i++){
           ans.add(matrix[i][edcol]);
        }
        //bottom:
        for(int j=edcol-1; j>=stcol; j--){
            if(strow==edrow){
                break;
            }
           ans.add(matrix[edrow][j]);
        }
        //left
        for(int i=edrow-1; i>=strow+1; i--){
            if(stcol==edcol){
                break;
            }
            ans.add(matrix[i][stcol]);
        }
         strow++;
         stcol++;
         edrow--;
          edcol--;
      }  
      return ans;
    }
}