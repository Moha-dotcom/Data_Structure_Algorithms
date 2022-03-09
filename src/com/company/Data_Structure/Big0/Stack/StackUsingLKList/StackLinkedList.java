package com.company.Data_Structure.Big0.Stack.StackUsingLKList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
public class  StackLinkedList {
    public LinkedList<Object> newStack;

    public StackLinkedList() {
        this.newStack = new LinkedList<>();
    }

    public boolean isEmpty(){
        if(newStack.size() == 0){
            System.out.println("Stack is Empty");
            return true;
        }else {
            System.out.println("Stack is not Emepty");
            return  false;
        }
    }



    public void push(Object e){
            newStack.add(e);
            System.out.println("Element is Added on the List successfully");
        }

        public Object pop(){
            return newStack.removeLast();

        }

    public void Iterator(){
        Iterator list = newStack.listIterator();

        while (list.hasNext()){
            Object hasn = list.next();
            System.out.print(hasn + " -> ");
        }

        System.out.println();

    }


    public Object peek(){
        return newStack.getLast();
    }


}
