public class StockBuy {
    public static int MaxProfit(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;  // Edge case: empty array
        
        int maxProfit = 0;
        int minPrice = arr[0];

        for (int i = 1; i < n; i++) {  // start from 1 (not 0)
            int profit = arr[i] - minPrice;   // potential profit
            maxProfit = Math.max(maxProfit, profit); // update max profit
            minPrice = Math.min(minPrice, arr[i]);   // update min price
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + MaxProfit(arr));
    }
}
