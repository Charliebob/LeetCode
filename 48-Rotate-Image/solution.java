public class Solution {
    public void rotate(int[][] matrix) {
       for(int i=0; i<matrix.length; i++){
           //transpose
           for(int j=i; j<matrix[0].length;j++){
               
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
            //rotate symmetry  水平翻转后是顺时针旋转  上下翻转后是逆时针翻转
       for(int i=0; i<matrix.length; i++){
           for(int j=0; j<matrix.length/2; j++){
                
               int temp = matrix[i][j];
               matrix[i][j] = matrix[i][matrix.length-j-1];
               matrix[i][matrix.length-j-1] = temp;
           }
       }
       
    }
}
