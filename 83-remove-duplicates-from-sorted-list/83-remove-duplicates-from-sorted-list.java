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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=head;
        if(prev==null)
            return head;
        ListNode curr=head.next;
        while(curr!=null){
            if(prev.val==curr.val){
                prev.next=curr.next;
                curr=prev.next;
            }
            else if(curr == null)
                return head;
            else{
                prev=prev.next;
                curr=curr.next;
            }
        }
        return head;
    }
}