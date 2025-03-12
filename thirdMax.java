

import java.util.Arrays;

public class thirdMax{

    //using bubble sort to sort given array.
    public static int[] bubbleSorting(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }

        return arr;
    }

    //Finding third max in an sorted array
    public static int maxOf(int[] arr){
        int max = arr[arr.length-1];
        int count = 1;
        for(int i = arr.length -1; i>=0; i--){
            if(max == arr[i]){

            }
            else{
                count ++;
                max = arr[i];
                if(count == 3){
                    return max;
                }
            }
        }


        return arr[arr.length-1];
    }

    //storing max values serially
    public static long max_3rd(int[] nums){
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2 & nums[i] < max1){
                max3 = max2;
                max2 = nums[i];

            }
            else if(nums[i] > max3 & nums[i] < max1 & nums[i] < max2){
                max3 = nums[i];
            }
            
        }
        return max3;
    }
    public static void main(String[] args){

        int[] sorted_array = bubbleSorting(new int[] {5, 5, 3, 3, 7, 5, 7});
        System.out.println("Sorted array is: " + Arrays.toString(sorted_array));

        int third_max = maxOf(sorted_array);
        System.out.println("Third max element is : " + third_max);

        long max_3rd = max_3rd(new int[] {7, 5, 7, 3, 9, 5, 6, 7});
        System.out.println("Third max is: " + max_3rd);
    }
}