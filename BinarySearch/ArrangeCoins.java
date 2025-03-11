

public class ArrangeCoins{
    public static int arrangeCoins(int n) {
        int st = 1, en = n;
        while(st<=en){
            int mid = st + (en - st)/2;
            long val = (long)mid*(mid+1)/2;
            if(val == n){
                return mid;
            }
            else if(val > n){
                en = mid -1;
            }
            else{
                st = mid +1;
            }
        }
        return en;
    } 

    public static void main(String[] args){
        System.out.println(arrangeCoins(8));
    }
}