package data_structures.linked_lists;

import common.LinkedListNode;

/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class LinkedListAddition {

    public static LinkedListNode addLists(LinkedListNode a, LinkedListNode b) {

        if (a == null && b == null) return null;
        LinkedListNode prev = null, head = null;
        int i,j,carry = 0;

        while (a != null || b != null) {
            i = j = 0;
            if (a != null) {
                i = a.data; a = a.next;
            }
            if (b != null) {
                j = b.data; b = b.next;
            }
            if (prev == null) {
                head = new LinkedListNode((i + j + carry) % 10);
                prev = head;
            } else {
                prev.append((i + j + carry) % 10);
                prev = prev.next;
            }
            carry = (i+j+carry) / 10;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head1 = new LinkedListNode(4);
        head1.append(3).append(2).append(1);
        LinkedListNode.print(head1);

        LinkedListNode head2 = new LinkedListNode(7);
        head2.append(8).append(9);
        LinkedListNode.print(head2);

        LinkedListNode headResult = addLists(head1, head2);
        LinkedListNode.print(headResult);
    }
}
