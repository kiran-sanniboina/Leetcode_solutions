/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode temp = headA;
        while(temp!=null){
            lengthA++;
            temp=temp.next;
        }
        temp = headB;
        while(temp!=null){
            lengthB++;
            temp=temp.next;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        if(lengthA>lengthB){
            int d = lengthA-lengthB;
            for(int i=0;i<d;i++){
                tempA=tempA.next;
            }
        }else{
            int d = lengthB-lengthA;
            for(int i=0;i<d;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}