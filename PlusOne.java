

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length -1; i>=0 ; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i] += 1;
                return digits;
            }
        }

        digits = new int[digits.length+1]; 
        digits[0] = 1;
        return digits;

    }

    public static void main(String[] args){
        int[] result = plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});//9,8,7,6,5,4,3,2,1,0]
        System.out.println(Arrays.toString(result));
    }
}
