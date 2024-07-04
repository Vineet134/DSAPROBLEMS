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
    public ListNode mergeNodes(ListNode head) {
        // merge nodes in between zeroes
    ListNode p=head.next;
  ListNode temp=p;
        
      
        while(temp!=null){
int sum=0;
        while(temp.val!=0){
            sum+=temp.val;
            temp=temp.next;
           }
          p.val=sum;
          temp=temp.next;
          p.next=temp;
          p=p.next;
         
        }
        return head.next;
    }
}