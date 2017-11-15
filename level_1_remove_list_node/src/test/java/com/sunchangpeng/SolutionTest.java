package com.sunchangpeng;

import org.junit.Test;

/**
 * @author sunchangpeng
 */
public class SolutionTest {
    @Test
    public void test_1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode nodeResult = Solution.removeElements(node1, 3);

        while (nodeResult != null) {
            System.out.println(nodeResult.val);
            nodeResult = nodeResult.next;
        }
    }
}