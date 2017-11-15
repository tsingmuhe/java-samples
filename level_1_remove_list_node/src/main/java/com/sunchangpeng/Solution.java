package com.sunchangpeng;

/**
 * @author sunchangpeng
 */
public class Solution {
    /**
     * @param head: a ListNode
     * @param val:  An integer
     * @return: a ListNode
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode newHead = null;
        ListNode current = head;

        while (current != null && current.val == val) {
            current = current.next;
        }

        if (current == null) {
            return newHead;
        }

        newHead = current;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return newHead;
    }
}
