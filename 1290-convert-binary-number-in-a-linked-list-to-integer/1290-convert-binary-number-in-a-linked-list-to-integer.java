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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        int sum=0,j=0;
        for(int i=a.size()-1;i>=0;i--){
            sum=sum+(int)(a.get(i) * Math.pow(2,j++));
            System.out.println(sum);
        }
        return sum;
    }
}