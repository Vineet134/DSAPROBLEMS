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
        ListNode temp=head;
int i=0;
int count=0;
        int rem=0;
        int sum=0;


while(temp.next!=null){
       ++count;
    temp=temp.next;
}


ListNode p=head;


         while(p!=null){
            rem=p.val;
            sum+=rem*Math.pow(2,(count)-i);
            ++i;
         p=p.next;

        }
        return sum;
    }
}