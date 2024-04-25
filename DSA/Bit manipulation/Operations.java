public class Operations {
    public static void main(String[] args) {
        System.out.println(getIthbit(10, 2));
        System.out.println(setIthbit(10, 2));
        System.out.println(clearIthbit(10, 1));
        System.out.println(updateIthbit(10, 2, 1));
        System.out.println(clearlastIbits(15, 2));
        System.out.println(clearRangeofbits(10, 2, 4));
    }

    // get ith bit
    public static int getIthbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // set ith bit
    public static int setIthbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // clear ith bit
    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // update ith bit
    public static int updateIthbit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearIthbit(n, i);
        } else {
            return setIthbit(n, i);
        }
    }

    // clear last i bits
    public static int clearlastIbits(int n, int i) {
        int bitmask = ~0 << i;
        return n & bitmask;
    }

    // clear range of bits
    public static int clearRangeofbits(int n, int i, int j) {
        int a = ~0 << j + 1;
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
}
