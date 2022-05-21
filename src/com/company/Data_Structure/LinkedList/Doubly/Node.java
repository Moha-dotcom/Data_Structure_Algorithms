package com.company.Data_Structure.LinkedList.Doubly;

public class Node {

    public int value;
    public Node next;
    public Node prev;


    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }
}
