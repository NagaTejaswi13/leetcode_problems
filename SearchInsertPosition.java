
public class SearchInsertPosition {
    
    //O(n)
    int Solution(int[] nums, int target){
        for(int i = 0;i<nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    //O(logn)
    int Solution2(int[] nums, int target){
        int start = 0, end= nums.length-1;
        while(start<end){
            int mid = (start +end)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        if(nums[start] >= target){
            return start;
        }
        else {
            return start++;
        }
     
    }

    public static void main(String[] args){

        SearchInsertPosition s1 = new SearchInsertPosition();
        int res = s1.Solution2(new int[]{1,3,5,6}, 0);
        System.out.println(res);

    }

    /*TestCases
    1. If null array insert at 0.
    2. If target exist return index
    3. If target doesnot:
        a. If there exist atleast one greater elem
        b. If no greter element exist insert at last index
    */
}
