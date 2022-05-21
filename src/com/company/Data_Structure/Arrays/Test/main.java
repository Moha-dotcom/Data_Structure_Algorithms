package com.company.Data_Structure.Arrays.Test;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String [] carsInStock  = {"blue" , "green", "green" , "green", "blue", "red",
                                "white", "blue", "blue", "gray","green", "green"  };
        // DealerShip President's Favorite Colors :  blue , green
        // Recent President's Favorite Colors : Purple , Black
        for(int i = 0 ; i < carsInStock.length; i++){
            if(carsInStock[i].equals("blue") ||  carsInStock[i].equals("green")){     // Check if carsInStock[i] is blue or "green;
                if(carsInStock[i].equals("blue")){    // if  blue color is Found Swap with Purple color
                    System.out.println("car number : " + i  + " - > needs to be painted - >  purple");
                    carsInStock[i] = "purple";
                }
                if(carsInStock[i].equals("green")){   // if green color is Found  swap with black
                    System.out.println("car number : " + i  + " - > needs to be painted - >  black");
                    carsInStock[i] = "black";
                }
            }
        }
        System.out.println("\n\n----Changed List of Car Inventory");
        System.out.println(Arrays.toString(carsInStock));
    }
}
