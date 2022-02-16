package com.company.Data_Structure.Big0.LinkedList.Singly;

public class SinglyLinkedList {

    public Node head;


    public void insertBegining(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;

        }
    }


    public void insertEndPostion(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;

        }
    }


    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " - > ");
            temp = temp.next;
        }

        System.out.println("\n");


    }


    private void searchNodeValue(int value) {
        int location = 0;
        if (head != null) {
            Node temp = head;

            while (temp != null) {

                if (temp.value == value) {
                    System.out.println("Found the node at location " + location);
                }
                temp = temp.next;
                location++;


            }

            System.out.println("Node not found");

        }


    }

    public void deleteFirstNode() {
        Node temp = head.next;
        head = temp;
        temp = head;
        printAll();


    }

    public void deleteGivenNode(int value) {

        if(head != null){
            System.out.println("Nothing to delete");
        }else{
            Node temp = head;
            while(temp != null){
                if(temp.value ==  value){
                    
                }
            }
        }


    }




    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertBegining(12);
        singlyLinkedList.insertBegining(19);
        singlyLinkedList.insertBegining(21);
        singlyLinkedList.insertEndPostion(33);


//        singlyLinkedList.printAll();
//        singlyLinkedList.searchNodeValue(88);

        singlyLinkedList.deleteFirstNode();




    }

}

