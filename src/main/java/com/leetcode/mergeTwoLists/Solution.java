package com.leetcode.mergeTwoLists;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode head = new ListNode();
        ListNode node = head;
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (node1 != null || node2 != null) {
            int val1 = Integer.MAX_VALUE;
            int val2 = Integer.MAX_VALUE;
            if (node1 != null) {
                val1 = node1.val;
            }
            if (node2 != null) {
                val2 = node2.val;
            }
            if (val1 < val2) {
                node.val = val1;
                node1 = node1.next;
            } else {
                node.val = val2;
                if (node2 != null) node2 = node2.next;
            }

            if (node1 != null || node2 != null) {
                ListNode next = new ListNode();
                node.next = next;
                node = next;
            }
        }
        return head;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists2(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists2(l2.next, l1);
                return l2;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode ListNode = solution.mergeTwoLists2(node1, node2);
        System.out.println(ListNode);
    }
}
