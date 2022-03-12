package com.company.Data_Structure.Big0.LinkedList.LinkedList_InterviewQuestions;

public class nthToLast {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.createLL(1);

        ll.insertNode(3);
        ll.insertNode(9);
        ll.insertNode(5);
        ll.insertNode(10);
        ll.insertNode(11);

        //    1 |3| 9| 5| 10| 11 | -> null

        System.out.println(nthToLast(ll, 3));;

    }


    public static Object nthToLast(LinkedList linkedList, int nth){



        Node p1 = linkedList.head;
        Node p2 = linkedList.head;

        
        for(int i = 0; i<=nth; i++){
            if(p2 == null) return null;
            p2 = p2.next;
            
        }



        while( p2 != null){
            p2 = p2.next;
            p1 = p1.next;

        }
        
        return p1.val;
    }


}
