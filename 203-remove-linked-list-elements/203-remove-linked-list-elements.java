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
    public ListNode removeElements(ListNode head, int val) {
    if(head == null)
        return head;
    
    ListNode current = head;
    ListNode previous = null;
  
    while(current != null){
        if(current.val == val)
        {
            if(current == head)
            {
                head = current.next;
            }
            else
            {
                previous.next = current.next;
            }
            current = current.next;
            continue;
        }
        previous = current;
        current = current.next;
    } 
   
    return head;
    }
}