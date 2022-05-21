package com.company.Data_Structure.Arrays;

public class restoreString {

    public static void main(String[] args) {

        String s = "codeleet";
        int []indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));

        System.out.println(restoreString2(s, indices));


    }

    public static String restoreString(String s, int[] indices) {


        if(s.length() == 0 || indices.length == 0){
            return " ";
        }

        String str = "";




        for(int i = 0; i<indices.length; i++){
            for(int j = 0; j<indices.length; j++){    //  4,5,6,7,0,2,1,3

                if(i == indices[j]){
                    char x = s.charAt(j);
                    str += x;
                }
            }

        }

        return str;


    }


    public static String restoreString2(String s, int[] indices) {

        char [] arr =  new char[indices.length];

        for(int  i = 0; i< s.length(); i++) {
            arr[indices[i]] = s.charAt(i);

        }

        return new String(arr);



    }


}
