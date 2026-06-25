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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode temp = head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        } 
        temp.next=head;
        k=k%size;
        int p=size-k;
        ListNode temp1=head;
        for(int i=1;i<=p-1;i++){
            temp1=temp1.next;
        }
        ListNode newhead=temp1.next;
        temp1.next=null;
        return newhead;
    }
}