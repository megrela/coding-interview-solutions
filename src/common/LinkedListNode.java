package Common;

/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class LinkedListNode {
    public LinkedListNode next = null;
    public int data;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode append(int d) {
        LinkedListNode last = new LinkedListNode(d);
        LinkedListNode cur = this;
        while(cur.next != null) cur = cur.next;
        cur.next = last;
        return last;
    }

    public static LinkedListNode deleteNode(LinkedListNode head, int data) {
        LinkedListNode cur = head;
        if (cur.data == data) {
            return cur.next;
        }

        while (cur.next != null) {
            if (cur.next.data == data) {
                cur.next = cur.next.next;
                return head;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void print(LinkedListNode head) {
        LinkedListNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static LinkedListNode mock() {
        LinkedListNode head = new LinkedListNode(1);
        head.append(2)
                .append(3)
                .append(1)
                .append(4)
                .append(2)
                .append(5);
        return head;
    }
}
