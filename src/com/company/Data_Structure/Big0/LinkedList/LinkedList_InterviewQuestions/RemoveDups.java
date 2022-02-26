package com.company.Data_Structure.Big0.LinkedList.LinkedList_InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.createLL(1);
        linkedList.insertNode(2);
        linkedList.insertNode(1);
        linkedList.insertNode(3);



        RemoveDups(linkedList);
        linkedList.traversalLL();

    }


    public static void RemoveDups(LinkedList Li) {

        Set s = new HashSet<>();

        // Setting Current to be the head of the LinkedList
        Node current = Li.head;
        Node prev = null; // prev element to be null

        while( current != null){
            int currval = current.val;
            if(s.contains(currval)){
                prev.next = current.next;
                Li.size--;

            }else{
                s.add(currval);
                prev = current;
            }

            current = current.next;


        }


    }
}
