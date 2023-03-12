//https://leetcode.com/problems/delete-node-in-a-linked-list/
//method 01
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode run=node;
        ListNode temp=null;
        while(run.next!=null){
            temp=run;
            run.val=run.next.val;
            run=run.next;
        }
        temp.next=null;
    }
}

//method 02
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode=null;
        nextNode=node.next;
        ListNode temp=node.next.next;
        node.val=nextNode.val;
        node.next=temp; 
    }
}
/*
1->2->3->4->5
deleted=3
node=>3
nextNode=>4
temp=>5
node.val=nextNode.val //node me next node ka value and delete nextNode
node.next=temp
1 2 4 5
*/
