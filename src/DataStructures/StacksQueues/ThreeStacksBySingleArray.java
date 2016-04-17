package DataStructures.StacksQueues;


/**
 * Created by Giorgi Megreli on 4/17/2016.
 */
public class ThreeStacksBySingleArray {
    private static int size = 100;
    private static int[] container = new int[3*size];
    private static int[] pointers = {-1,-1,-1};

    private static void push(int stack, int value) {
        int ind = stack * size + pointers[stack] + 1;
        pointers[stack] ++;
        container[ind] = value;
    }

    private static int pop(int stack) {
        int ind = stack * size + pointers[stack];
        pointers[stack] --;
        return container[ind];
    }

    private static int peek(int stack) {
        int ind = stack * size + pointers[stack];
        return container[ind];
    }

    private static boolean isEmpty(int stack) {
        return pointers[stack] == -1;
    }

    private static void print(int stack) {
        for (int i = pointers[stack]; i >= 0; i--) {
            int ind = stack * size + i;
            System.out.print(container[ind] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(0, 11);
        push(0, 12);
        push(1, 21);
        push(1, 22);
        push(0, 13);
        print(0);
        print(1);
        pop(1);
        push(1,23);
        print(0);
        print(1);
    }
}
