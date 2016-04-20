package DataStructures.StacksQueues;

import java.util.Stack;

/**
 * Created by Giorgi Megreli on 4/20/2016.
 */
public class QueueWithTwoStacks {
    private Stack<Integer> stack1, stack2;

    public QueueWithTwoStacks() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public int size() {
        return this.stack1.size() + this.stack2.size();
    }

    public void enqueue(Integer k) {
        this.stack1.push(k);
    }

    public int dequeue() {
        if (!this.stack2.isEmpty()) return this.stack2.pop();
        while (!this.stack1.isEmpty()) {
            this.stack2.push(this.stack1.pop());
        }
        return this.stack2.pop();
    }

    public int peek() {
        if (!this.stack2.isEmpty()) return this.stack2.peek();
        while (!this.stack1.isEmpty()) {
            this.stack2.push(this.stack1.pop());
        }
        return this.stack2.peek();
    }



    public static void main(String[] args) {
        QueueWithTwoStacks q = new QueueWithTwoStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        for (int i = 0; i < 4; i++) {
            System.out.println(q.dequeue());
        }
    }
}
