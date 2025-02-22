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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head, curr = head, newHead = head.next;
        while (curr != null && curr.next != null) {
            ListNode succ = curr.next;
            pre.next = succ;
            curr.next = succ.next;
            succ.next = curr;
            pre = curr;
            curr = curr.next;
        }
        return newHead;
    }
}