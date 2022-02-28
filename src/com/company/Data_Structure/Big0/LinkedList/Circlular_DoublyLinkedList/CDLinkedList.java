package com.company.Data_Structure.Big0.LinkedList.Circlular_DoublyLinkedList;

public class CDLinkedList {
    public Node head;
    public Node tail;
    public int val;
    int size;

    public int getSize() {
        return size;
    }

    public Node CreateCDLinkedList(int value){
        head = new Node();
      Node node = new Node();

      head = node;
      tail = node;
      node.next = node;
      node.prev = node;
      node.val = value;
      size = 1;

      return node;

    }


    public void insertion(int location, int val){
        Node newNode = new Node();
        newNode.val = val;

        if(head!= null){
            if(location == 0){
                newNode.prev = tail;
                head.prev = newNode;
                newNode.next = head;
                tail.next = newNode;
                head = newNode;
            }else if(location == size){
                newNode.next = head;
                tail.next = newNode;
                newNode.prev = tail;
                head.prev = newNode;
                tail = newNode;
            }else {
                Node temp = head;
                int index = 0;

                while (index < location - 1) {
                    temp = temp.next;
                    index++;
                }

                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next = newNode;
                newNode.next.prev = newNode;
            }



            size++;
            }
        }


        public void traverse(){
            Node temp = head;

            System.out.print("Head - > ");
            for(int i =0;  i<size; i++){
                System.out.print(temp.val + " - > ");
                temp = temp.next;
            }
            System.out.println(" Tail  ");
        }


        public void ReverseTraverse(){
            Node temp = tail;

            if(temp != null){
                for(int i = 0; i < size; i++){
                    System.out.print(temp.val + " - >");
                    temp = temp.prev;

                }
                System.out.println();
            }else {
                System.out.println("Elemetn Doesn't Exist");
            }

        }


        public boolean SearchNode(int val){




            if(head != null) {
                Node temp = head;
                int index = 0;
                while (index < size) {
                    if (temp.val == val) {
                        System.out.println(temp.val + " Element is Available in the List" + " at index " + index);
                        return true;
                    }
                    temp = temp.next;
                    index++;
                }
            }

            System.out.println("Element Doesn't Exist");
            return false;


        }


        public void DeleteNode(int location) {

            if (head != null) {


                if(location == 0){
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                    size--;

                }else if(location == size){

                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                    size--;

                }else{

                    Node temp = head;
                    int index = 0;

                    while (index < location - 1) {

                        temp = temp.next;
                        index++;

                }
                    temp.next = temp.next.next;
                    temp.next.prev = temp;

                    size--;


               }

            }
        }

}
