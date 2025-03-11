package LeetCode;

import java.util.Arrays;
public class RemoveAllOccurancesOfAnElement {
    
    int[] remove(int[] nums, int val){
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[index] = nums[i];
                index++;
            }
        }
        return nums; 
    }

    public static void main(String[] args){
        RemoveAllOccurancesOfAnElement r1 = new RemoveAllOccurancesOfAnElement();
        int[] res = r1.remove(new int[]{2,2,2,3,4,5,2,2,6,7,8}, 2);
        System.out.println("/n"+Arrays.toString(res));
    }
}
