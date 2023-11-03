package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ReverseLinkedListIi{
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
    ListNode tmpNode = null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == 1){
            return reverseN(head,right);
        }
        head.next = reverseBetween(head.next,left-1,right-1);
        return head;

    }
    public ListNode reverseN(ListNode head,int n){
        if(n == 1){
            tmpNode = head.next;
            return head;
        }
        ListNode lastnode = reverseN(head.next,n-1);
        head.next.next = head;
        head.next = tmpNode;
        return lastnode;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}