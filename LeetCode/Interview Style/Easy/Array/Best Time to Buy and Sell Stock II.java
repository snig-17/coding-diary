package Array;

// 02-08-25

/*
QUESTION:
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.
*/

/*
MY OBSERVATIONS:
- multiple tries
- took time to understand correct logic, but got it first time
- try using pen and paper to visualize the problem
- i test loops and array multiple time, think through rather than just testing
*/

/*
FEEDBACK:


class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        
        int maxProfit = 0;
        
        // Capture profit from every price increase
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        
        return maxProfit;
    }
}

1. Code Simplification & Readability - Your current loop structure can be streamlined
2. Edge Case Handling
3. Variable Naming - Follows Java camelCase convention

ALTERNATIVE SOLUTION (WITH MATH):
This leverages Math.max(0, difference) to only add positive profits.
class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        
        // Sum all positive differences
        for (int i = 1; i < prices.length; i++) {
            totalProfit += Math.max(0, prices[i] - prices[i-1]);
        }
        
        return totalProfit;
    }
}
*/

class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i <= prices.length - 2;){
            if (prices[i+1] > prices[i]){
                maxprofit = maxprofit + (prices[i+1] - prices[i]);
                i++;
            } else {
                i++;
            }
        }
        return maxprofit;
    }
}