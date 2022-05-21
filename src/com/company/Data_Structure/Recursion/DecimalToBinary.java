package com.company.Data_Structure.Recursion;

public class DecimalToBinary {

    public static void main(String[] args) {

        String a = " ";
        int b = 233;

        System.out.println(ConvertDecimalToBinary(b, a));

    }

    public static String ConvertDecimalToBinary(int decimal, String result){
        if(decimal == 0 ){
            return result;
        }

        result += decimal % 2 ;
        return ConvertDecimalToBinary(decimal/2, result);

    }
}
