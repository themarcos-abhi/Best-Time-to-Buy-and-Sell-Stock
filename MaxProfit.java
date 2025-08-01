public class MaxProfit {
    public static void main(String[] args) {
        int[] First_Price = {7, 1, 5, 3, 6, 4};
        int[] Second_Price = {7, 6, 4, 3, 1};

        System.out.println("Max Profit for prices1: " + maxProfit(First_Price));
        System.out.println("Max Profit for prices2: " + maxProfit(Second_Price));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
