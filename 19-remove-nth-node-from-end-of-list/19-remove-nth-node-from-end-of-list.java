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
        if(head==null)
            return head;
        else{
            ListNode temp=head;
            ListNode prev=null;
            int c=0;
            while(temp!=null){
                c++;
                temp=temp.next;
            }
            n=c-n;
            temp=head;
            if(n==0)
                return temp.next;
            while(n-->0){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
            return head;
        }
    }
}