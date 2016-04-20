package DataStructures.StacksQueues;

import java.util.Stack;

/**
 * Created by Giorgi Megreli on 4/20/2016.
 */
public class SortStack {
    static Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> sorted = new Stack<>();
        while (!stack.isEmpty()) {
            int top = stack.pop();
            while (!sorted.isEmpty() && sorted.peek() > top) {
                stack.push(sorted.pop());
            }
            sorted.push(top);
        }
        return sorted;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(5);
        s.push(3);
        s.push(2);
        s.push(3);
        s = sort(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
