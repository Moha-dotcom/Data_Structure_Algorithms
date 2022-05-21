package com.company.Data_Structure.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {
        LinkedList nl = new LinkedList<>();
        nl.add(1);
        nl.add(1);
        nl.add(2);
        nl.add(3);
        nl.add(4);


//        System.out.println( deleteDuplicates(nl));


    }
}

//
//    public boolean hasCycle(ListNode head) {
//
//        // Before doing anything else we Check if the head is null, if it is we return false.
//        if(head == null) return false; //Check point 1
//        ListNode slow =  head; // moves one point
//        ListNode fast = head.next;  // moves two points
//
//
//        while (slow != fast || ( fast != null && fast.next != null) ){
//            fast = fast.next.next;
//            slow = slow.next;
//            return false;
//        }
//
//
//        return true;
//
//
//
//    }



//    public  static LinkedList  deleteDuplicates(LinkedList head) {
//
//
//
//        Set s = new HashSet();
//
//        while (head!= null){
//            if(s.contains(head)){
//              continue;
//            }else{
//                s.add(head);
//            }
//
//            head = head.
//
//        }
//
//
//
//
//
//    }



//}


//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//}
//
//
//class ListNode1 {
//    int val;
//    ListNode next;
//    ListNode1() {}
//    ListNode1(int val) { this.val = val; }
//    ListNode1(int val, ListNode next) { this.val = val; this.next = next; }
//}