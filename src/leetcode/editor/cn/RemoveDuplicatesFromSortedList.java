package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class RemoveDuplicatesFromSortedList{
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode slow = head,fast = head;
        while(fast.next != null){
            if(fast.next.val != fast.val){
                slow = slow.next;
                slow.val = fast.next.val;
            }
            fast = fast.next;
        }
        slow.next=null;
        return head;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}