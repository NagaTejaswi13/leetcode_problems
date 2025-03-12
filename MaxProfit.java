
public class MaxProfit {

    public static int minOf(int[] prices){
        int min = prices[0];
        int minIndex = 0;
        for(int i =0; i<prices.length; i++){
            if(prices[i]<min){
                minIndex = i;
                min = prices[i];
            }
        }
        return minIndex;
    }
    public static int maxOf(int[] prices, int buy){
        int max = prices[buy];
        int maxIndex = buy;
        for(int i = buy; i<prices.length; i++){
            if(prices[i]>max){
                maxIndex = i;
                max = prices[i];
            }
        }
        return maxIndex;
    }
    public static int maxProfit(int[] prices){
        int buy = minOf(prices);
        int sell = maxOf(prices, buy);
        return prices[sell] - prices[buy];
    }
    public static void main(String[] args){
         System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }
}
