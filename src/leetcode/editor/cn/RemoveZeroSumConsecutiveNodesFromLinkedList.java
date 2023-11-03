package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveZeroSumConsecutiveNodesFromLinkedList{
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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map = new HashMap<Integer,ListNode>();
        ListNode dummy = new ListNode(0,head);
        ListNode p = head;
        int sum = 0;
        map.put(0,dummy);
        while(p!=null){
            sum += p.val;
            if(map.containsKey(sum)){
                ListNode node = map.get(sum);
                ListNode dele = node.next;
                node.next = p.next;
                int dsum = sum;
                while(dele!=p){
                    dsum = dsum+dele.val;
                    map.remove(dsum);
                    dele = dele.next;
                }
            }else{
                map.put(sum,p);
            }
            p = p.next;
        }
        return dummy.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}