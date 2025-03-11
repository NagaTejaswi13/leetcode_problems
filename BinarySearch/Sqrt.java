

public class Sqrt {
    public static int mySqrt(int x) {
        if (x < 2) return x; // Handle edge cases
        
        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid; // Exact square root found
            } else if (square < x) {
                ans = mid; // Store the potential answer
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(mySqrt(8));
    }
}
