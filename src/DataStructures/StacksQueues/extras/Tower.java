package DataStructures.StacksQueues.extras;

import java.util.Stack;

/**
 * Created by Giorgi Megreli on 4/20/2016.
 */
public class Tower {
    private Stack<Integer> stack;
    private int index;

    public Tower(int index) {
        this.index = index;
        this.stack = new Stack<>();
    }

    public int getIndex() {
        return this.index;
    }

    public void add(int size) {
        if (!this.stack.isEmpty() && this.stack.peek() <= size) {
            System.out.println("Error adding plate: " + size);
            return;
        }
        this.stack.add(size);
    }

    public void move(Tower tower) {
        int top = this.stack.pop();
        tower.add(top);
        System.out.println("Move plate" + top + "from" + this.getIndex() + " to " + tower.getIndex());
    }

    public void movePlates(int count, Tower to, Tower temporary) {
        if (count > 0) {
            this.movePlates(count - 1, temporary, to);
            this.move(to);
            temporary.movePlates(count - 1, to, this);
        }
    }

    public void print() {
        System.out.println("Tower " + this.getIndex());
        for (int i = this.stack.size() - 1; i >= 0; i--) {
            System.out.println(this.stack.get(i) + " ");
        }
    }
}
