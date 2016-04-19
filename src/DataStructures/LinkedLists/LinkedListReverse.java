package DataStructures.LinkedLists;

import Common.LinkedListNode;

import java.util.Stack;

/**
 * Created by Giorgi Megreli on 4/19/2016.
 */
public class LinkedListReverse {

    static LinkedListNode reverseList(LinkedListNode head) {
        if (head == null || head.next == null) return head;
        LinkedListNode cur = head.next;
        LinkedListNode prev = head;
        while (cur.next != null) {
            LinkedListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head.next = null;
        cur.next = prev;
        return cur;
    }

    static LinkedListNode reverseListByStack(LinkedListNode head) {
        Stack<LinkedListNode> stack = new Stack<>();
        LinkedListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        LinkedListNode reverseHead = stack.pop();
        cur = reverseHead;
        while (!stack.isEmpty()) {
            LinkedListNode next = stack.pop();
            cur.next = next;
            next.next = null;
            cur = next;
        }
        return reverseHead;
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListNode.mock();
        LinkedListNode.print(head);
        LinkedListNode reveredStack = reverseListByStack(head);
        LinkedListNode.print(reveredStack);
        LinkedListNode reversed = reverseList(reveredStack);
        LinkedListNode.print(reversed);

    }
}
