/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        else{
            ListNode temp=head;
            HashSet<ListNode> h=new HashSet<>();
            while(temp!=null){
                if(h.contains(temp.next))
                    return temp.next;
                else
                    h.add(temp);
                temp=temp.next;
            }
        }
        return null;
    }
}