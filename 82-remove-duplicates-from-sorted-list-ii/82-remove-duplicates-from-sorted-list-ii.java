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
        int c=0,n=0;
        ListNode l =new ListNode();
        ListNode t=l;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        temp=head;
        for(int i=0;i<n;i++){
            int j=temp.val;
            ListNode prev=head;
            while(prev!=null){
                if(prev.val==j)
                    c++;
                prev=prev.next;
            }
            if(c<2){
                ListNode node =new ListNode(j);
                t.next=node;
                t=t.next;
            }
             c=0;
            temp=temp.next;
        }
        return l.next;
    }
}