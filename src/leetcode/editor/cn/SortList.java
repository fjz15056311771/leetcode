package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class SortList{
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
    public ListNode sortList(ListNode head) {
        return sort(head,null);
    }
    public ListNode sort(ListNode head,ListNode tail){
        if(head==null){
            return head;
        }
        if(head.next==tail){
            head.next=null;
            return head;
        }
        ListNode slow=head,fast=head;
        while(fast!=tail){
            slow = slow.next;
            fast = fast.next;
            if(fast!=tail){
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode l1 = sort(head,mid);
        ListNode l2 = sort(mid,tail);
        ListNode sorted = merge(l1,l2);
        return sorted;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }else if(l1.val<l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else{
            l2.next = merge(l2.next,l1);
            return l2;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}