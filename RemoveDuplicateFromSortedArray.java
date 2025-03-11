package LeetCode;

import java.util.Arrays;

class RemoveDuplicateFromSortedArray{

    //Reduce array length by 1 unit
    int shiftArrayElements(int[] arr){
        
        int i = 0;
        int j = i+1;
        int array_length = arr.length;
        while(i<array_length){
            try{
                if(arr[i]==arr[j]){
                    j = i;
                    for(int k = j+1; k<arr.length; k++){
                        arr[j] = arr[k];
                        j++;
                    }
                    j = i+1; 
                    array_length--;
                }
                else{
                    i++;
                    j++;
                }
                System.out.println("\n"+ Arrays.toString(arr));
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(arr.length);
                return arr.length;
            }
            
        }    
            
        
        return array_length+1;
    }

    int shiftArrayElements(){
        int[] arr = {1};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println(i+1);
        return i+1;
    }

    //Linearly swapping unique elements
    int countUniqueElements(int[] nums){
        int i = 0;
        int j = i+1;
        while(i<nums.length-1 && j< nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                i++;
                j++;
            }
        }
        
        return i+1;
    }
    
    public static void main(String[] args){
        RemoveDuplicateFromSortedArray r1 = new RemoveDuplicateFromSortedArray();
        r1.shiftArrayElements();
        r1.shiftArrayElements(new int[] {1});
        //Testcase: {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,5}

        r1.countUniqueElements(new int[] {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,5});
        
    } 
}