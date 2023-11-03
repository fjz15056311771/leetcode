package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class FanZhuanLianBiaoLcof{
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}