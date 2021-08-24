import java.util.*;
//将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。

 class ListNode {
 int val;
   ListNode next = null;
 }


public class test08 {
    /**
     *
     * @param l1 ListNode类 
     * @param l2 ListNode类 
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode mergeNode =null;
        if(l1.val<l2.val){
            mergeNode=l1;
            mergeNode.next=mergeTwoLists(l1.next,l2);

        }else{
            mergeNode=l2;
            mergeNode.next=mergeTwoLists(l2.next,l1);
        }
        return mergeNode;

    }
}
