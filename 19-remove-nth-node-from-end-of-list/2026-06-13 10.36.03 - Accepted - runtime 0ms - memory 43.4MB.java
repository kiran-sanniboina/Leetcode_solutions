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
        if(head==null){
            return head;
        }
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==n){
            return head.next;
        }
        int pos = size-n-1;
        ListNode temp1 = head;
        for(int i=0;i<pos;i++){
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}