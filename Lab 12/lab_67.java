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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       
        if(head==null || head.next==null) return head;
         ListNode slow=head;
         ListNode fast= head.next;

         while(fast!=null){
            
            int gcd =gcd(slow.val,fast.val); 
            ListNode newNode = new ListNode(gcd);
            slow.next=newNode;
            newNode.next=fast;
            slow=fast;
            fast = fast.next;
         }
    
       return head;
    }
        public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
