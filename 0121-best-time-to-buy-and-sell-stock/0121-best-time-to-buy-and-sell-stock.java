class Solution {
    public int maxProfit(int[] arr) {
        
        int min = arr[0];
        int profit = 0;
        for(int i =1;i<arr.length;i++)
        {
            int cost = arr[i] - min;
            profit = Integer.max(profit,cost);
            min = Integer.min(min,arr[i])  ;  
        }
        return profit;
    }
}