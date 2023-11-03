package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class RemoveNthNodeFromEndOfList{
//leetcode submit region begin(Prohibit modification and deletion)
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0,head);
//        ListNode first = head;
//        ListNode second = dummy;
//        for(int i=0;i<n;i++){
//            first = first.next;
//        }
//        while(first!=null){
//            first = first.next;
//            second = second.next;
//        }
//        second.next = second.next.next;
//        return dummy.next;
//        ListNode dummy =new ListNode(0,head);
//        ListNode first = head;
//        ListNode second = dummy;
//        for(int i=0;i<n;i++){
//            first = first.next;
//        }
//        while(first!=null){
//            first = first.next;
//            second = second.next;
//        }
//        second.next = second.next.next;
//        return dummy.next;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = head,slow = dummy;
        while(n>0){
            fast = fast.next;
            n--;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}