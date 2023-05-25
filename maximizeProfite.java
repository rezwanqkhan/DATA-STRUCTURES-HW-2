import java.util.LinkedList;
// FIRST PROBLEM
//NAME & LASTNAME: REZWANULLAH QURAISHI
// STUDENT NO: 200316057

public class maximizeProfite {
    public static void main(String[] args) {
        // Create a LinkedList to hold the prices
        LinkedList<Integer> prices1 = new LinkedList<>();

        // Add prices to the list
        prices1.add(4);
        prices1.add(5);
        prices1.add(5);
        prices1.add(2);
        prices1.add(4);
        prices1.add(6);
        prices1.add(1);

        LinkedList<Integer> prices2 = new LinkedList<>();
        prices2.add(6);
        prices2.add(5);
        prices2.add(4);
        prices2.add(3);
        prices2.add(2);
        prices2.add(1);
        prices2.add(1);

        // Call the maximizeProfit method and store the result as string
        String result1 = maximizeProfit(prices1);
        String result2 = maximizeProfit(prices2);

        // Print the input and output for prices1
        System.out.println("Input:");
        System.out.println("Prices1: " + prices1);
        System.out.println("Output:");
        System.out.println(result1);

        System.out.println();

        // Print the input and output for prices2
        System.out.println("Input:");
        System.out.println("Prices2: " + prices2);
        System.out.println("Output:");
        System.out.println(result2);
    }

    // Method to maximize profit given a list of prices
    public static String maximizeProfit(LinkedList<Integer> prices) {
        // Check if the list is empty
        if (prices.size() < 1) {
            return "No buying and selling\nProfit = 0";
        }

        // Initialize variables to track maximum profit, buy day, and sell day
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;

        // Nested loops to compare each pair of prices
        for (int i = 0; i < prices.size() - 1; i++) {
            for (int j = i + 1; j < prices.size(); j++) {
                // Calculate the profit by subtracting the buy price from the sell price
                int profit = prices.get(j) - prices.get(i);

                // Update maximum profit and corresponding buy/sell days if a higher profit is
                // found
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyDay = i + 1;
                    sellDay = j + 1;
                }
            }
        }

        // Check if no profitable trade is found
        if (maxProfit == 0) {
            return "No profitable trade\nProfit = 0";
        } else {
            // Return the buy day, sell day, and maximum profit
            return "Buy on day " + buyDay + ", sell on day " + sellDay + "\nProfit = " + maxProfit;
        }
    }
}
