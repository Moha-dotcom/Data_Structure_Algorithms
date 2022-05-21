package com.company.Data_Structure.LinkedList.Circlular_DoublyLinkedList;

public class Node {
    public Node next;
    public Node prev;
    public int val;

    public Node(Node next, Node prev, int val) {
        this.next = next;
        this.prev = prev;
        this.val = val;
    }

    public Node() {

    }
}
