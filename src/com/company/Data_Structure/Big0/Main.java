package com.company.Data_Structure.Big0;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int [] A = new int[]{7, 10,9}; // 1,1,2,3,4,6


        System.out.println(solution(A));

    }

    public static  int solution(int[] A) {
        // write your code in Java SE 8


        int mean =  sum(A) / A.length;
        int sos  = mean * A.length;
        int posS = sum(A) - sos;


        return posS;



        // Smallet Positive integer greater than 0 than doesn't occur in A[]
    }

    public static int sum(int A[]) {
        int sum= 0;

        for(int i = 0; i< A.length;i++){
            sum = sum + A[i];
        }

        return sum;
    }

}


