package arrays;

import java.util.Arrays;

public class ReshapeMatrix{

    public static int[][] Solution(int[][] mat, int r, int c){
        int k = 0, l = -1;
        int row = mat.length;
        int column = mat[0].length;

        if ((row*column)==r*c){
            int[] res = new int[row*column];
            int[][] resp = new int[r][c];
        
            for(int i =0; i<mat.length; i++){
                for(int j = 0; j<mat[i].length;j++){
                    res[k] = mat[i][j];
                    k++;
                }
            }
            
            k = 0; 
        
            for(int i =0; i<r;i++){
                for(int j = 0; j<c;j++){
                    resp[i][j] = res[k];
                    k++;
                }
            }
            return resp;
        }
        return mat;  
    }
     // Helper method to print 2D array
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] mat = { {1, 2}, {3, 4} };
        int[][] reshapedMatrix = Solution(mat, 1, 4);

        // Print the reshaped matrix
        printMatrix(reshapedMatrix);
    }
}