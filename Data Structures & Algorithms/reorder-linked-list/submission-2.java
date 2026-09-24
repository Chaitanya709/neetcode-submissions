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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        //Finding mid point
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null; // ← CUT

        ListNode prev = null;
        ListNode curr = mid; // ← start from mid, not mid.next

        //Reversing 2nd half
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Reorddering the list 
        ListNode x = head;
        while (prev != null) {
            ListNode a = x.next;
            ListNode b = prev.next;
            x.next = prev;
            prev.next = a;
            prev = b;
            x = a;
        }
    }
}
