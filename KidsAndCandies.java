package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsAndCandies {
    private static List<Boolean> res1;
    private static boolean allOf(int[] arr, int num){
        for(int ele: arr){
            if(num < ele){
                return false;
            }
        }
        return true;
    }

    private static List<Boolean> kidsWithCandiesHelper(int[] can, int extra, int index){
        List<Boolean> res = new ArrayList<Boolean>();
        if(index == can.length){
            return res;
        }
        res.add(allOf(can, can[index]+extra));
        res.addAll(kidsWithCandiesHelper(can, extra, index+1));
        return res;
        
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return kidsWithCandiesHelper(candies, extraCandies, 0);  
    }

    //Utilizing an class member to print result, instead of wasting space at every recursion call.
    //More space Optimized solution.
    private static List<Boolean> kidsWithCandiesHelper1(int[] can, int extra, int index){
        
        if(index == can.length){
            return res1;
        }
        res1.add(allOf(can, can[index]+extra));
        return kidsWithCandiesHelper1(can, extra, index+1);
    }
    public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
        res1 = new ArrayList<>();
        return kidsWithCandiesHelper1(candies, extraCandies, 0);
    }


    public static void main(String[] args){
        System.out.println(kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}
    
