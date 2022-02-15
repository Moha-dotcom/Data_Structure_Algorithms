package com.company.Data_Structure.Big0.Arrays;

public class Pairs {

    public static void main(String[] args) {


        int []  nums = {2,4,3,5,6,-2,4,7,8,9};
        int sum = 7;

        System.out.println(Pairs(nums, sum));


    }


    public static String Pairs(int [] arr ,  int sum){


        String result = " ";

        for(int i =0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    result += arr[i] + ":" + arr[j] + " ";
                }
            }
        }

        return result;
    }


    public static boolean canReorderDoubled(int[] arr) {


        return true;
    }
}
