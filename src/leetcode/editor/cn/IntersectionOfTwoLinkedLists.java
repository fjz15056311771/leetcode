package leetcode.editor.cn;
public class IntersectionOfTwoLinkedLists{
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null){
//            return null;
//        }
//        ListNode pA = headA;
//        ListNode pB = headB;
//        while(pA != pB){
//            pA = pA == null ? headB : pA.next;
//            pB = pB == null ? headA : pB.next;
//        }
//        return pA;
//        if(headA == null || headB == null){
//            return null;
//        }
//        ListNode pA = headA,pB = headB;
//        while (pA != pB){
//            pA = pA == null ? headB : pA.next;
//            pB = pB == null ? headA : pB.next;
//        }
//        return pB;
        ListNode pA = headA,pB = headB;
        while (pA != pB){
            if(pA == null){
                pA = headB;
            }else{
                pA = pA.next;
            }
            if(pB == null){
                pB = headA;
            }else{
                pB = pB.next;
            }
        }
        return pB;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}