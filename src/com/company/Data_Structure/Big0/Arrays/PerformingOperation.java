package com.company.Data_Structure.Big0.Arrays;

public class PerformingOperation {


    public static void main(String[] args) {

        String [] operations = {"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(operations));
        System.out.println(finalValueAfterOperations2(operations));

    }

    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;
        if(operations.length == 0){
            return 0;
        }

        for(int i  = 0 ; i< operations.length; i++){
            if(operations[i].equals("--X") || operations.equals("X--")){
                x -= 1;
            }else if(operations[i].equals("++X") || operations[i].equals("X++")){
                x += 1;
            }

        }




        return x;

    }


    public static int finalValueAfterOperations2(String  [] operations ){

        int x= 0;

        for(String str : operations){
        if(str.contains("+")){
            x += 1;
        }

        if(str.contains("-")){
            x -= 1;
        }
    }

        return x;

}

}
