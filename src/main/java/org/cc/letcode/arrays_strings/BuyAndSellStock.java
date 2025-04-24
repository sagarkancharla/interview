package org.cc.letcode.arrays_strings;

public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minBuy = Integer.MAX_VALUE;
        int maxProf = 0;
        for (int price : prices) {
            minBuy = Math.min(minBuy, price);
            maxProf = Math.max(maxProf, price - minBuy);
        }
        return maxProf;
    }

    public static void main(String[] args) {
        int res = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        int res1 = maxProfit(new int[]{6, 5, 4, 3, 2});
        System.out.println(res);
        System.out.println(res1);
    }
}
