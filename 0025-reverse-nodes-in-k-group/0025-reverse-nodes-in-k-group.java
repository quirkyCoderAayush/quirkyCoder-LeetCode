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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)return head;
        int count=0;
        ListNode temp = head;

        while(temp!=null && count<k) {
            temp=temp.next;
            count++;
        }

        if(count<k) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        for(int i=0; i<k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if(next != null) {
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }
}