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
        if(head.next==null) return true;
        List<Integer> elements = new ArrayList<>();

        ListNode curr = head;

        while(curr != null) {
            elements.add(curr.val);
            curr=curr.next;
        }
        int left=0, right=elements.size()-1;
        while(left < right) {
            if(elements.get(left) == elements.get(right)) {
                left++;
                right--;
            }
            else  return false;
        }
        return true;
    }
}