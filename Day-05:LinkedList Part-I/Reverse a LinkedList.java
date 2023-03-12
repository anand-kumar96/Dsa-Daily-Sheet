//https://leetcode.com/problems/reverse-linked-list/submissions/
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
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        ListNode run=head;
        ListNode prev=null;
        if(head==null){
            return head;
        }
        while(run!=null){
            temp=run.next;
            run.next=prev;
            prev=run;
            run=temp;
        }
        if(prev!=null){
            head=prev;
        }
        return head;
    }
}
