 class StockProfit {
    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0)
        {
            return 0;
        }
        
        int minvalue=Integer.MAX_VALUE;
        int maxvalue=0;
        for (int i=0;i<prices.length ;i++ )
        {
            if (prices[i]<minvalue)
            {
                minvalue=prices[i];
            }
            int current=prices[i]-minvalue;
            if(current>maxvalue)
            {
                maxvalue=current;
            }
        }
        return maxvalue;
    }
    
    
}
public class Main{
public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        StockProfit stockProfit=new StockProfit();
        System.out.println("Maximum Profit: " + stockProfit.maxProfit(prices1)); // Output: 5

        int[] prices2 = {5, 4, 3, 2, 1};
        System.out.println("Maximum Profit: " + stockProfit.maxProfit(prices2)); // Output: 0
    }
}
