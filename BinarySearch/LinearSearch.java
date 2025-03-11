
public class LinearSearch {
    boolean booleanLinearSearch(int[] nums, int value){
        if(nums.length == 0){
            return false;
        }

        for(int ele: nums){
            if(ele == value){
                return true;
            }
        }
        return false;
    }

    int indexLinearSearch(int[] nums, int value){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == value){
                return i;
            }
        }

        return -1;
    }

    int maxElementofArray(int[] nums){
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    int searchInArray(int[] nums, int start, int end, int value){
        if(start<end){
            for(int i = start; i<end; i++){
                if(nums[i] == value){
                    return i;
                }
            }
        }
        return -1;
        
    }

    public static void main(String[] args){
        LinearSearch l1 = new LinearSearch();
        int res = l1.indexLinearSearch(new int[]{1, 2, 3, 4, 5, 6, 7}, 8);
        System.out.println("\nindex is " + res);

        boolean result = l1.booleanLinearSearch(new int[]{1, 2, 3, 4, 5, 6, 7}, 8);
        System.out.println("Element found status: " + result);

        int maximumElement = l1.maxElementofArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("Max element of array " + maximumElement);

        int searchRange = l1.searchInArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 1, 5, 5);
        System.out.println("Serach in range index: " + searchRange);

        System.out.println(567/10);
    }
}
