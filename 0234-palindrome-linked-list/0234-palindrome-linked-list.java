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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode reversedHalfHead = reverList(slow);
        ListNode firstHalfHead = head;

        while(reversedHalfHead != null) {
            if (firstHalfHead.val != reversedHalfHead.val) return false;
            firstHalfHead = firstHalfHead.next;
            reversedHalfHead = reversedHalfHead.next;
        }
        return true;
    }
    private ListNode reverList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}