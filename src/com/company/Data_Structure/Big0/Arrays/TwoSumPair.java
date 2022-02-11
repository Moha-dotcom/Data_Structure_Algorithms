package com.company.Data_Structure.Big0.Arrays;

import java.util.Arrays;

public class TwoSumPair {

    public static void main(String[] args) {

        int[] nums = {9, 1, 2, 3, 4, 5, 6, 19};
        int target = 9;

//        int [] result = twoSum(nums, target);
//        System.out.println(Arrays.toString(result));

        maxProduct(nums);


//        int [] run = {1,2,3,4,5};
//        int[] result = runningSum(run);
//        System.out.println(Arrays.toString(result));;



//        int [][]  accounts = {{1,5}, {7,3}, {3,5}};
////        int [][]  accounts = {{1,2,3},{3,2,1}};
//        System.out.println(maximumWealth(accounts));



    }

    // 2011. Final Value of Variable After Performing Operations




    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};

                }

            }

        }

        throw new IllegalArgumentException("no solution found");
    }


    public static String maxProduct(int[] intArray) {
        // TODO
        int max = 0;
        String pairs = "";

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < intArray.length; j++) {  // 10,20,30,50
                int product = intArray[i] * intArray[j];
                max = Math.max(max, product);
                pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);


            }
        }

        return pairs;
    }

    // Running Sum of 1d Array
    public static int[] runningSum(int[] nums) {

        int sum = 0;

        int running[] = new int[nums.length];

        for(int  i =0; i< nums.length; i++){
            sum += nums[i];
            running[i] = sum;

        }


        return running;






    }





}
