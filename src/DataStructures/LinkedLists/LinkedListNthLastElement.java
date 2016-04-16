package DataStructures.LinkedLists;

import Common.LinkedListNode;

/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class LinkedListNthLastElement {

    public static LinkedListNode nthLast(LinkedListNode head, int n) {
        LinkedListNode last = head;
        LinkedListNode cur = head;
        for (int i = 0; i < n - 1; i++) {
            if (last == null) {
                return null;
            }
            last = last.next;
        }

        while (last.next != null) {
            cur = cur.next;
            last = last.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListNode.mock();
        LinkedListNode.print(head);
        LinkedListNode.print(nthLast(head, 3));
    }
}
