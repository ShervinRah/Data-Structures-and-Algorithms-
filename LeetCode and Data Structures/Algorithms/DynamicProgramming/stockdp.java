package DynamicProgramming;

public class stockdp
{
    public static int profit(int prices[], int fee)
    {
        int len = prices.length;
        int[] buy = new int[len + 1];
        int[] sell = new int[len + 1];
        
        for(int i = len - 1; i >= 0; i--)
        {
            if(sell[i + 1] - prices[i] > buy[i + 1]) {
            	
                buy[i] = sell[i+1] - prices[i];
            }
            else {
            	
                buy[i] = buy[i+1];
            }
            if(buy[i+1] + prices[i] - fee > sell[i+1]) {
            	
            	sell[i] = buy[i+1] + prices[i] - fee;
            }
                
            else {
            	
                sell[i] = sell[i+1];
            }
        }
        return buy[0];
    }
        public static void main (String[] args) 
        {
            int prices[] = {10, 20, 30, 40};
            int fee = 5;
            System.out.println(profit(prices, fee));
        }
}