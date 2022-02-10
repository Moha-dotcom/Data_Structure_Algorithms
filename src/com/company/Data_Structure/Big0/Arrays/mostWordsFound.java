package com.company.Data_Structure.Big0.Arrays;

import java.util.ArrayList;

public class mostWordsFound {


    public static void main(String[] args) {

        String [] sent = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};


        System.out.println(mostWordsFound(sent));;

    }



    public static int  mostWordsFound(String [] sentences){
        int count = 0;

        int max = 0;



        for(int i = 0; i<sentences.length; i++){
            String[] s = sentences[i].split(" ");
            count = s.length;
            max = Math.max(max, count);

        }

        count = 0;


     return max;


    }
}
