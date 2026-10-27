class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;

        int i=0;
        int j=1;

        while(j<prices.length) {
            if(prices[j] > prices[i]) {
                maxP= Math.max(maxP, prices[j]-prices[i]);
            }
            else {
                i=j;
            }
            j++;   
        }

        return maxP;

       
    }
}
