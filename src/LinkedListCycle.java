//给你一个链表的头节点 head ，判断链表中是否有环。
//如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
//如果链表中存在环，则返回 true 。 否则，返回 false 。

//输入：head = [3,2,0,-4], pos = 1
//输出：true
//解释：链表中有一个环，其尾部连接到第二个节点。

//输入：head = [1], pos = -1
//输出：false
//解释：链表中没有环。


import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static boolean solution1(ListNode head){
        Set<ListNode> seen = new HashSet<ListNode>();
        while(head != null){
            if(!seen.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static boolean solution2(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args){
        ListNode d = new ListNode(-4);
        ListNode c = new ListNode(0,d);
        ListNode b = new ListNode(2,c);
        ListNode a = new ListNode(3,b);
//        d.next = b;
        System.out.println(solution2(a));
    }
}
