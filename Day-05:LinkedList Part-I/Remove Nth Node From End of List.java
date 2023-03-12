//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode run=head;
        int pos=0;
        while(run!=null){
            pos++;
            run=run.next;
        }
        if(pos==n){
            return head.next;
        }
        run=head;
        for(int i=1;i<pos-n;i++){
            run=run.next;
        }
        run.next=run.next.next;
        return head;
    }
}
// using pointer
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p1=dummy;
        ListNode p2=dummy;
        for(int i=0;i<n;i++){
            p1=p1.next;
        }
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=p2.next.next;
       return dummy.next;
    }
}
