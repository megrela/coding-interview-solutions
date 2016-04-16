package DataStructures.LinkedLists;

import Common.LinkedListNode;

/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class LinkedListRemoveNode {
    public static void removeNode(LinkedListNode node) {
        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
    }
    public static void main(String[] args) {
        LinkedListNode head = LinkedListNode.mock();
        LinkedListNode.print(head);
        removeNode(head.next.next);
        LinkedListNode.print(head);
    }
}
