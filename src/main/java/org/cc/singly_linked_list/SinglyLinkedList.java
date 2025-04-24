package org.cc.singly_linked_list;

public class SinglyLinkedList {

    private static ListNode head;

    static {
        head= new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
    }

    public static void main(String[] args) {
        printListNode(head);
        System.out.println(length(head));
        printListNode(insertFirst(7));
        printListNode(insertLast(2));
    }

    public static void printListNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static int length(ListNode head) {
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static ListNode insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static ListNode insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return head;
        }

        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
}
