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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || head.next==null || left==right) return head;
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;

        for(int i=1; i<left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next = null, prevSubList = null;

        for(int i=0; i<=right-left; i++) {
            next = curr.next;
            curr.next = prevSubList;
            prevSubList = curr;
            curr = next;
        }

        prev.next.next = curr;
        prev.next = prevSubList;

        return temp.next;


    }
}