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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode dummy = new ListNode(0, head);
          ListNode prev = dummy;
          ListNode curr = head;
          ListNode temp=head;
                   
          int j=1;
          int size=1;
          while(temp!=null){
            size++;
            temp= temp.next;
          }
         
          while(curr.next !=null && j!=size-n){

            prev= prev.next;
            curr = curr.next;
            j++;
            
          }
          prev.next=curr.next;

           return dummy.next;       
    }
}
