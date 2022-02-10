package com.company.Data_Structure.Big0.Arrays;

public class MaxiumWealth {

    public static void main(String[] args) {

        int [][]  accounts = {{1,5}, {7,3}, {3,5}};
        int [][]  accounts1 = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));


    }



    // Richest Customer Wealth

    public static int maximumWealth(int[][] accounts) {

        int max = 0;
        int sum = 0;
        for(int row =0; row<accounts.length; row++){
            for(int col =0; col<accounts[0].length; col++){
                sum += accounts[row][col];
                max = Math.max(max, sum);


            }

            sum = 0;


        }


        return max;


    }

}
