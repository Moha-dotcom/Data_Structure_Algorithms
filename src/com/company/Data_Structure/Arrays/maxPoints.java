package com.company.Data_Structure.Arrays;

import java.util.Arrays;

public class maxPoints {

    public static void main(String[] args) {


        int [][] arr = {{1,2,3}, {1,5,1}, {3,1,1}};


//        int arr1 [] = {53925, 1,2,3, 0};
//
//        System.out.println(MaxNumber(arr1));


        maxPoints(arr);



    }



    public static void maxPoints(int[][] points) {

        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length ; j++){
                System.out.println(points[i][j]);
            }
        }


    }


    public  static  int MaxNumber(int [] arr){

        int save = 0 ;

        for(int i : arr){
           save =  Math.max(i, save);
        }


        return save;
    }


}


