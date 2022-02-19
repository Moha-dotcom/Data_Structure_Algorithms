package com.company.Data_Structure.Big0.LinkedList.LinkedList_InterviewQuestions;

public class Node {
    public int val;
    public Node prev;
    public Node next;


    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(int val, Node prev, Node next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

    public Node() {
    }
}
