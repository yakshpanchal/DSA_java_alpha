public class buyAndSellStocks {

    public static int buyAndSellStocks(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice<price[i]) {
                int profit = price[i]-buyprice;
                maxprofit = Math.max(maxprofit, profit);

            }
            else{
                buyprice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}
