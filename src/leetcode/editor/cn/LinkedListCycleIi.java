package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class LinkedListCycleIi{
//leetcode submit region begin(Prohibit modification and deletion)
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
//        ListNode slow=head,fast=head;
//        while(fast!=null){
//            slow = slow.next;
//            if(fast.next!=null){
//                fast=fast.next.next;
//            }else{
//                return null;
//            }
//            if(fast==slow){
//                ListNode p = head;
//                while(p!=slow){
//                    slow = slow.next;
//                    p = p.next;
//                }
//                return p;
//            }
//        }
//        return null;
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}