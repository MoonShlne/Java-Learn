package task122;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/10 19:50
 */
public class stock {
    public int maxProfit(int[] prices) {
        int salary=0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i]<prices[i+1]){
                salary+=prices[i+1]-prices[i];
            }

        }

        return  salary;
    }
    }
