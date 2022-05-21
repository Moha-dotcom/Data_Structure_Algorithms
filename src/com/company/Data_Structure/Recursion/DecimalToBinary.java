package com.company.Data_Structure.Recursion;

public class DecimalToBinary {

    public static void main(String[] args) {

        String a = " ";
        int b = 233;

        System.out.println(ConvertDecimalToBinary(b, a));

        System.out.println(Sum(1, 0));

    }

    public static String ConvertDecimalToBinary(int decimal, String result){
        if(decimal == 0 ){
            return result;
        }

        result += decimal % 2 ;
        return ConvertDecimalToBinary(decimal/2, result);
    }


    // Sum of Natural Number using Recursion

    public static Integer Sum(Integer n, Integer addition){
        if(n == 0 || n <= 1){
            return addition;
        }

        addition += n;
        return Sum(n-1, addition);
    }
}
