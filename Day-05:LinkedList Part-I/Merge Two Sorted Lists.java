//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
//withspace
//method 01
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode head=null;
        if(list1==null && list2==null){
            return head;
        }
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }else if(list1.val<list2.val){
            head=list1;
            list1=list1.next;
        }else{
            head=list2;
            list2=list2.next;
        }
        ListNode temp=head;
        ListNode dummy=null;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dummy=list1;
                temp.next=dummy;
                temp=dummy;
                list1=list1.next;
            }else{
                dummy=list2;
                temp.next=dummy;
                temp=dummy;
                list2=list2.next;
            }
        }
        if(list1==null){
            temp.next=list2;
        }else{
             temp.next=list1;
        }
        
      return head;
    }
}
//method 02
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode head=null;
        if(list1==null && list2==null){
            return head;
        }
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }else if(list1.val<list2.val){
            head=list1;
            list1=list1.next;
        }else{
            head=list2;
            list2=list2.next;
        }
        ListNode temp=head;
        ListNode dummy=null;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dummy=list1;
                temp.next=dummy;
                temp=dummy;
                list1=list1.next;
            }else{
                dummy=list2;
                temp.next=dummy;
                temp=dummy;
                list2=list2.next;
            }
        }
        while(list1!=null){
                dummy=list1;
                temp.next=dummy;
                temp=dummy;
                list1=list1.next;
        }
        while(list2!=null){
            dummy=list2;
                temp.next=dummy;
                temp=dummy;
                list2=list2.next;
        }
        
      return head;
    }
}
// in place
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1==null) return l2;
        if(l2==null) return l1;
        // finding list which start with small data and assigning that list with l1
        if(l1.val>l2.val){
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode res=l1;
        while(l1!=null && l2!=null){
            ListNode temp=null; // every iteration
            while(l1!=null && l1.val<=l2.val){
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;
            // swap
            temp=l1;
            l1=l2;
            l2=temp;
        }
        return res;
    }
}
