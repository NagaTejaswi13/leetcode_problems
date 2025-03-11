package LeetCode;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }

        //largest square in int range is 2,147,395,600 = 46340 * 46340, So our answer lies within this range.
        int low = 1;
        int high = 46340;
        while(low<=high){
            int mid = low + (high - low)/2;
            long val = mid*mid;
            if(val==num){
                return true;
            }
            else if(val > num){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPerfectSquare(808201));
    }

}
