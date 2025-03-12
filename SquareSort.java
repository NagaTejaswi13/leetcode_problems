

import java.lang.Math;
import java.util.Arrays;

public class SquareSort {

    static boolean swapped;
    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++){
            swapped = false;
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        return nums;
    }

    public static void main(String[] args){

        int[] s1 = sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(Arrays.toString(s1));
    }
    
}
