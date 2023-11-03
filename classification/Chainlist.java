public class Chainlist {
    //删除链表的倒数第N个节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode first = head;
        ListNode second = dummy;
        for(int i=0;i<n;i++){
            first = first.next;
        }
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    //合并两个有序链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) {
            return list2;
        }else if(list2==null){
            return list1;
        }else if(list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list2.next,list1);
            return list2;
        }
    }

    //
}

