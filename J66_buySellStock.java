public class J66_buySellStock {
    public static int buySellPrice(int prices[]){
        //set the buyPrice to infinity..
        int buyPrice = Integer.MAX_VALUE;
        //set maxprofit to 0.
        int maxProfit = 0;

        int buyday = 0 ;
        int sellday = 0;

        //loop
        for (int i = 0 ;i< prices.length;i++){
            if(buyPrice<prices[i]){
                //to calculate the profit..
                int profit = prices[i] - buyPrice;
                //to check maximum from current profit and maxProfit

                //maxProfit = Math.max(maxProfit, profit);  **

                if(profit>maxProfit){
                    maxProfit = profit; // storing to the maxprofit for the profit.
                    sellday = i ; //updating the sell day.
                }
            } 
            else{
                buyPrice = prices[i];
                buyday = i; //updating the buy day.
            }
        }
        System.out.println("Buy on day: "+buyday+" and ( Price: "+prices[buyday]+")");
        System.out.println("Sell on day: "+sellday+" and ( Price: "+prices[sellday]+")");
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("The maximum profit will be: "+buySellPrice(prices));
    }

}
