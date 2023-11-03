package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class LianBiaoZhongDaoShuDiKgeJieDianLcof{
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
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode slow = head,fast = head;
        while(k>0){
            fast = fast.next;
            k--;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}