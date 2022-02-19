package com.company.Data_Structure.Big0.LinkedList.LinkedList_InterviewQuestions;

public class LinkedList {

    public  Node head;
    public  Node tail;
    public int size;





    public void createLL(int nodeVal){
        Node newNode = new Node(nodeVal, null);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        Node newNode = new Node();
        newNode.val = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i =0; i<size; i++) {
            System.out.print(tempNode.val);
            if (i != size -1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
    }
}
