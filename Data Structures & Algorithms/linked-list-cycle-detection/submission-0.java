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
    public boolean hasCycle(ListNode head) {

     Set<ListNode> headSet = new HashSet<>();

     ListNode temp = head;
     while(temp != null) {
        if(!headSet.contains(temp)) {
            headSet.add(temp);
            temp = temp.next;
        }
        else {
            return true;
        }
     }

     return false;
        
    }
}
