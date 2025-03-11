package LeetCode;

public class GoodPairs {
    private static int count;
    private static void numIdenticalPairs(int[] nums, int i, int j){
        if(i == nums.length-2){
            return;
        }
        if(j <= nums.length-1){
            if(nums[i] == nums[j]){
                count++;
            }
            numIdenticalPairs(nums, i, ++j);
        }else{
            i = i+1;
            numIdenticalPairs(nums, i, i+1);
        }
        
        
        
    }
    public static int numIdenticalPairs(int[] nums) {
        count = 0;
        numIdenticalPairs(nums, 0, 1);
        return count;
    }

    public static void main(String[] args){
        System.out.println(numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3}));
    }
}