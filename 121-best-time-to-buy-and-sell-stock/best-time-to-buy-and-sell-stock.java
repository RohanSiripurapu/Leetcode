class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int max=Integer.MIN_VALUE;
       int min=prices[0];
       for(int i=0;i<n;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        int diff=prices[i]-min;
        max=Math.max(diff,max);
       }
       return max;
    }
}