package org.cc.letcode.linkedlists;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (head.next != null) {
            if(head.val == head.next.val) {
                head.next = head.next.next;
            } else
                head = head.next;
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}

