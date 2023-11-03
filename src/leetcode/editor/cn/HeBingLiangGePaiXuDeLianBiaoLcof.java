package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class HeBingLiangGePaiXuDeLianBiaoLcof{
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1),p = dummy;
        while (l1 != null && l2 != null){
            if(l2.val>l1.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1 == null) p.next=l2;
        if(l2 == null) p.next=l1;
        return dummy.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}