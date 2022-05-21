package com.company.Data_Structure.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        /*
            ArrayDeque
            LinkedList
            PriorityDeque
         */

        Queue<Object> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        System.out.println(queue);


    }
}
