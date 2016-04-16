package DataStructures.LinkedLists;

import CommonT.LinkedListNode;
import java.util.Hashtable;

/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class LinkedListRemoveDuplicates {

    public static void deleteDuplicates(LinkedListNode head) {
        Hashtable<Integer, Boolean> hash = new Hashtable<>();
        LinkedListNode prev = null, cur = head;
        while (cur != null) {
            if (hash.containsKey(cur.data) && prev != null)
                prev.next = cur.next;
            else {
                hash.put(cur.data, true);
                prev = cur;
            }
            cur = cur.next;
        }
    }

    public static void deleteDuplicatesWithouHashTable(LinkedListNode head) {
        LinkedListNode prev = head;
        LinkedListNode cur = prev.next;
        while (cur != null) {
            LinkedListNode runner = head;
            while (!(runner == cur)) {
                if (runner.data == cur.data) {
                    LinkedListNode tmp = cur.next;
                    prev.next = tmp;
                    cur = tmp;
                    break;
                }
                runner = runner.next;
            }
            if (runner == cur) {
                prev = cur;
                cur = cur.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListNode.mock();
        LinkedListNode.print(head);
        deleteDuplicates(head);
        LinkedListNode.print(head);

        head = LinkedListNode.mock();
        LinkedListNode.print(head);
        deleteDuplicatesWithouHashTable(head);
        LinkedListNode.print(head);
    }
}
