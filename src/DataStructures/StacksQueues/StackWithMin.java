package DataStructures.StacksQueues;


import Common.StackNodeWithMin;

import java.util.Stack;

/**
 * Created by Giorgi Megreli on 4/17/2016.
 */

public class StackWithMin extends Stack<StackNodeWithMin> {
    public void push(int item) {
        int min = Math.min(item, this.getMin() );
        super.push(new StackNodeWithMin(item, min));
    }

    public int getMin() {
        if (this.isEmpty())
            return Integer.MAX_VALUE;
        else return this.peek().min;
    }

    public static void main(String[] args) {
        StackWithMin s = new StackWithMin();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(2);
        System.out.println(s.getMin());
        s.pop();
        s.pop();
        System.out.println(s.getMin());
    }
}
