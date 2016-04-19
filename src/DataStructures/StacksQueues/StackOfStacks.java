package DataStructures.StacksQueues;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Giorgi Megreli on 4/19/2016.
 */
public class StackOfStacks {

    private ArrayList<Stack<Integer>> container;
    private Stack<Integer> currentStack;
    private int limit;

    public StackOfStacks() {
        this.container = new ArrayList<>();
        container.add(new Stack<>());
        this.currentStack = container.get(0);
        this.limit = 2;
    }

    public void push(Integer k) {
        if (this.currentStack.size() == this.limit) {
            System.out.println("creating another stack for: " + k.toString());
            this.container.add(new Stack<>());
            this.currentStack = this.container.get( this.container.size() - 1 );
        }
        this.currentStack.push(k);
    }

    public Integer pop() {
        Integer peek = this.peek();
        this.currentStack.pop();
        if (this.currentStack.isEmpty()) {
            this.container.remove( this.container.size() - 1 );
            this.currentStack = this.container.get( this.container.size() - 1 );
            System.out.println("deleted last stack at: " + peek);
        }
        return peek;
    }

    public Integer peek() {
        return this.currentStack.peek();
    }

    public static void main(String[] args) {
        StackOfStacks ss = new StackOfStacks();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);
        ss.pop();
        ss.push(6);
    }
}
