/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode abc = head;

        int size = 0;
        while (abc != null) {
            size++;
            abc = abc.next;
        }

        if (head == null) {

            return null;
        }

        ListNode temp = head;

        ListNode temp2 = head;

        for (int i = 0; i != k-1; i++) {
            temp = temp.next;
        }
        for (int i = 0; i != size - k ; i++) {
            temp2 = temp2.next;

        }
        int iron = temp.val;

        temp.val = temp2.val;
        temp2.val = iron;
         return head;
    }
} my orignal code
