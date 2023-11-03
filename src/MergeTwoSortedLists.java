//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]

//输入：l1 = [], l2 = []
//输出：[]

//输入：l1 = [], l2 = [0]
//输出：[0]

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class MergeTwoSortedLists {
    public static ListNode solution(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next = solution(l1.next,l2);
            return l1;
        }else{
            l2.next = solution(l2.next,l1);
            return l2;
        }
    }

    public static void printNode(ListNode head){
        if(head == null){
            System.out.println("empty!");
            return;
        }
        ListNode cur = head;
        while(cur.next != null){
            System.out.println(cur.val);
            System.out.println("-");
            cur = cur.next;
        }
        System.out.println(cur.val);

    }

    public static void main(String[] args){
        ListNode l1head = new ListNode(1,new ListNode(3,new ListNode(5)));
        ListNode l2head = new ListNode(2,new ListNode(4,new ListNode(6)));
        printNode(l1head);
        printNode(l2head);
        ListNode merge = solution(l1head,l2head);
        printNode(merge);
    }
}
