package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class PartitionList{
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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p1 = dummy1,p2 = dummy2;
        ListNode p = head;
        while(p != null){
            if(p.val >= x){
                p2.next = p;
                p2 = p2.next;
            }else{
                p1.next = p;
                p1 = p1.next;
            }
            ListNode tmp = p.next;
            p.next = null;
            p = tmp;
        }
        p1.next = dummy2.next;
        return dummy1.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}