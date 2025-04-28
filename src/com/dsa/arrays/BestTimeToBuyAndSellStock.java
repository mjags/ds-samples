package com.dsa.arrays;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int min = prices[0];
        int max = Integer.MIN_VALUE;

        for (int price : prices) {
            int money = price - min;
            if (money > max) max = money;
            if (price < min) min = price;
        }

        return max;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
        System.out.println(stock.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
