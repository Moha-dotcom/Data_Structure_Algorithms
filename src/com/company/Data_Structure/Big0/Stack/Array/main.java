package com.company.Data_Structure.Big0.Stack.Array;

import com.company.Data_Structure.Big0.Stack.StackUsingLKList.StackLinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {


//        Stack stack = new Stack(4);
//        System.currentTimeMillis();
//        stack.push(4);
//        stack.push(0);
//        stack.push(291);
//        int popElement = stack.pop();
//        System.out.println(popElement);
//        System.out.println(popElement);
//        int peekElement = stack.peek();
//        System.out.println(peekElement);


        StackLinkedList stackLinkedList = new StackLinkedList();
       stackLinkedList.push(9);
        stackLinkedList.push(20);
        stackLinkedList.push(6);
        stackLinkedList.push(100);



       stackLinkedList.Iterator();

        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());

        stackLinkedList.Iterator();


        stackLinkedList.isEmpty();


//        ArrayList<Object> newArray = new ArrayList<>();
//        newArray.add(12);
//        newArray.add(13);
//        newArray.add(14);
//        newArray.indexOf(newArray.size());
//
//
//        System.out.println(newArray);




    }
}
