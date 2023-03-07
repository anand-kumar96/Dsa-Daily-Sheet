//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
//method01
class Solution {
    public int maxProfit(int[] prices) {
      int buy= prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else{
                profit +=prices[i]-buy;
                buy=prices[i];
            }
        }
        return profit;
    }
}

//method 02
class Solution {
    public int maxProfit(int[] prices) {
      int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
                }
        }
        return profit;
    }
}
