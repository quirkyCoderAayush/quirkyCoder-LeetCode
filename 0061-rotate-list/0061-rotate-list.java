/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) return head;

        ListNode curr = head;
        int count = 1;

        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        k = k % count;
        if (k == 0) {
            return head; 
        }

        ListNode newTail = head;
        for (int i = 1; i < count - k; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        curr.next = head; 

        return newHead;

    }
}