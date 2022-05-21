package com.company.Data_Structure.Arrays;

import java.util.*;

public class TwoDArray {


    public static void main(String[] args) {

        int [][] myarr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};



//        System.out.println(sumDiagonal(myarr));

        sumDiagonalPoints(myarr);


    }

    public static int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int row=0; row<a.length ; row++) {

                sum += a[row][row];
        }
        return sum;

    }


    public static  void sumDiagonalPoints(int [][] arr){
        int sum = 0;
        List<Integer> intarr = new ArrayList<>();
        int j = arr.length - 1;

        for(int i = arr.length - 1; i > 0; i--){

            sum += arr[i][i];
            intarr.add(arr[i][i]);









        }

        System.out.println(sum);
        System.out.println(intarr);

    }

}


//
//    int sum = 0;
//    List<Integer> intarr = new ArrayList<>();
//        for(int row = arr.length - 1; row >= 0; row--){
//                sum += arr[row][row];
//                intarr.add(arr[row][row]);
//
//                }
//
//                System.out.println(sum);
//                System.out.println(intarr);