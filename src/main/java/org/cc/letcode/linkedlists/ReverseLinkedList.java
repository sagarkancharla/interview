package org.cc.letcode.linkedlists;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode = reverseList(new ListNode(1, new ListNode(2, new ListNode(3, null))));
        System.out.println(listNode);
    }
}
