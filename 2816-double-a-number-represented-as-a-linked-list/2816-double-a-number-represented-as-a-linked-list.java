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
public class Solution {
    // To compute twice the value of each node's value and propagate carry
    public int twiceOfVal(ListNode head) {
        // Base case: if head is null, return 0
        if (head == null) return 0;
        
        // Double the value of current node and add the result of next nodes
        int doubledValue = head.val * 2 + twiceOfVal(head.next);
        
        // Update current node's value with the units digit of the result
        head.val = doubledValue % 10;
        
        // Return the carry (tens digit of the result)
        return doubledValue / 10;
    }
    
    public ListNode doubleIt(ListNode head) {
        int carry = twiceOfVal(head);
        
        // If there's a carry, insert a new node at the beginning with the carry value
        if (carry != 0) {
            head = new ListNode(carry, head);
        }
        
        return head;
    }
}