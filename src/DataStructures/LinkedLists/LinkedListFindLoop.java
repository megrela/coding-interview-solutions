package DataStructures.LinkedLists;

import Common.LinkedListNode;

/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class LinkedListFindLoop {

    public static LinkedListNode findCircle(LinkedListNode head) {
        LinkedListNode r1 = head, r2 = head;
        while (r2 != null && r2.next != null) {
            r1 = r1.next;
            r2 = r2.next.next;
            if (r1 == r2) {
                break;
            }
        }

        if (r2 == null || r2.next == null) {
            return null;
        }

        r1 = head;
        while (r1 != r2) {
            r1 = r1.next;
            r2 = r2.next;
        }
        return r1;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode tail = head.append(1).append(2).append(3).append(4);
        tail.next = head.next.next.next;
        LinkedListNode r = findCircle(head);
        if (r != null) {
            System.out.println(r.data);
        }
    }
}
