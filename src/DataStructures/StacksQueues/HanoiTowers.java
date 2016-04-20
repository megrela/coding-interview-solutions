package DataStructures.StacksQueues;

import DataStructures.StacksQueues.extras.Tower;

/**
 * Created by Giorgi Megreli on 4/20/2016.
 */
public class HanoiTowers {
    public static void main(String[] args) {
        int n = 6;
        Tower[] towers = new Tower[3];
        for(int i=0; i<3; i++) {
            towers[i] = new Tower(i);
        }
        for(int i=n; i > 0; i--)
            towers[0].add(i);

        towers[0].movePlates(n, towers[2], towers[1]);

        towers[0].print();
        towers[1].print();
        towers[2].print();
    }
}


