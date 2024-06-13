class Solution {
    public int maxProfit(int[] prices) {
    int buyprice=Integer.MAX_VALUE;
    int profit=0;
    int maxprofit=0;
    for(int i=0;i<prices.length;i++){
        if(buyprice<prices[i]){
            profit=prices[i]-buyprice;
            maxprofit=Math.max(profit,maxprofit);
        }
        else{
            buyprice=prices[i];
        }
    }
return maxprofit;
    }
}