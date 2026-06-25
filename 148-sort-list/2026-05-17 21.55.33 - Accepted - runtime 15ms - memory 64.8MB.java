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
    public ListNode sortList(ListNode head) {
        List<Integer> arr = new ArrayList<>(); 
        int i=0;
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
            i++;
        }
        Collections.sort(arr);
        ListNode out = new ListNode();
        ListNode temp1 = out;
        for(int j=0;j<arr.size();j++){
            temp1.next = new ListNode(arr.get(j));
            temp1=temp1.next;
        }
        return out.next;
    }
}