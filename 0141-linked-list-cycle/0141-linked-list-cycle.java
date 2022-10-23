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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        if(head==null)
            return false;
        else{
            HashMap<Integer,ListNode> h=new HashMap<>();
            while(temp!=null){
                if(h.containsValue(temp.next))
                    return true;
                h.put(temp.val,temp);
                temp=temp.next;
            }
        }
        return false;
    }
}