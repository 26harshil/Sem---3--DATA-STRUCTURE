/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) {
 * this.val = val;
 * }
 * ListNode(int val, ListNode next) {
 * this.val = val;
 * this.next = next;
 * }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode hh = new ListNode();
        ListNode l1 = hh;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                l1.next = list1;
                list1 = list1.next;
            } else {
                l1.next = list2;
                list2 = list2.next;
            }
            l1 = l1.next;
        }
        if (list1 != null) {
            l1.next = list1;
        } else {
            if (list2 != null) {
                l1.next = list2;
            }

        }

        return hh.next;
    }
}
