package com.nowcoder.swordoffer;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by ChenRui on 2018/3/12
 * <p>
 * ��Ŀ����
 * ����һ����������ת�������������������Ԫ�ء�
 */
public class ReverseList {

    // ͷ�巨
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;
        ListNode p = null;
        while (head!=null) {
            p = head.next;
            head.next = tail;
            tail = head;
            head = p;
        }
        return tail;
    }

    public static void main(String[] args) {
        ReverseList obj = new ReverseList();
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(5);
        listNode.next.next.next.next = new ListNode(6);

        ListNode node = obj.reverseList(listNode);
        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);
        System.out.println(node.next.next.next.val);
        System.out.println(node.next.next.next.next.val);
    }
}