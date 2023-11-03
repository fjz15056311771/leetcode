package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class LinkedListCycle{
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
    public boolean hasCycle(ListNode head) {
//        if(head==null || head.next==null) return false;
//        ListNode slow = head,fast = head.next;
//        while(slow!=fast){
//            if(fast==null || fast.next==null) return false;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return true;
//        if(head == null || head.next == null) return false;
//        ListNode slow = head,fast = head.next;
//        while(slow!=fast){
//            if(fast == null || fast.next == null){
//                return false;
//            }
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return true;

//        ListNode slow=head,fast=head;
//        while(fast!=null){
//            slow = slow.next;
//            if(fast.next!=null){
//                fast=fast.next.next;
//            }else{
//                return false;
//            }
//            if(fast==slow){
//                return true;
//            }
//        }
//        return false;
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;



    }
}
//leetcode submit region end(Prohibit modification and deletion)

}