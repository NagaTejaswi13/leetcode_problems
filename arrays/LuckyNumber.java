package arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {

    //calculates minimum element index of each row
    public static int minimum(int[] arr){
        int min_index =0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[min_index]){
                min_index = i;
            }
        }
        return min_index;
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> lucky_number = new ArrayList<Integer>();
        
        //Comparing minimum element of each row or maximum element of each colum
        for(int i = 0; i<matrix.length; i++){

            int min_index = minimum(matrix[i]);

            int max = matrix[i][min_index];

            //Verifying minimum element is maximum of column or not.
            for(int j = 0;j<matrix.length; j++){
               if(matrix[j][min_index] > max){
                    max = matrix[j][min_index];
                    break;
                }
            }

            if(max == matrix[i][min_index]){
                lucky_number.add(matrix[i][min_index]);
            }
        }
        return lucky_number;
    }
    
    public static void main(String[] args){
        System.out.println(luckyNumbers(new int[][]{{1,10,4,2}, {9,3,8,7}, {15,16,17,12}}).toString());
    }
}
