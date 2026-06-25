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
    public int pairSum(ListNode head) {
        if(head==null){
            return 0;
        }
        if(head.next==null){
            return head.val;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev = null;
        ListNode temp = slow;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        ListNode first = head;
        ListNode second = prev;
        int max = 0;
        while(second!=null){
            max=Math.max(max,first.val+second.val);
            first=first.next;
            second=second.next;
        }
        return max;
    }
}