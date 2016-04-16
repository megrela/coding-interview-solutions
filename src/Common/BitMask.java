package Common;

/**
 * Created by Giorgi Megreli on 4/14/2016.
 */
public class BitMask {
    private int mask;

    public BitMask() {
        this.mask = 0;
    }

    public BitMask(int state) {
        this.mask = state;
    }

    public int checkBit(int bit) {
        return (this.mask & (1 << bit));
    }

    public void on(int bit) {
        this.mask |= (1 << bit);
    }

    public void off(int bit) {
        this.mask &= ~(1<<bit);
    }
}
