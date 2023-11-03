package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class MergeTwoSortedLists{
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if(list1==null) {
//            return list2;
//        }else if(list2==null){
//            return list1;
//        }else if(list1.val<list2.val){
//            list1.next = mergeTwoLists(list1.next,list2);
//            return list1;
//        }else {
//            list2.next = mergeTwoLists(list2.next,list1);
//            return list2;
//        }
//        if(list1 == null){
//            return list2;
//        }else if(list2 == null){
//            return list1;
//        }else if(list1.val < list2.val){
//            list1.next = mergeTwoLists(list1.next,list2);
//            return list1;
//        }else{
//            list2.next = mergeTwoLists(list1,list2.next);
//            return list2;
//        }
        ListNode dummy = new ListNode(-1),p = dummy;
        ListNode p1 = list1,p2 = list2;
        while(p1 != null && p2 != null){
            if(p1.val > p2.val){
                p.next = p2;
                p2 = p2.next;
            }else{
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if(p1 == null) p.next=p2;
        if(p2 == null) p.next=p1;
        return dummy.next;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}