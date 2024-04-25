import java.util.*;

public class MaxLengthPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlength = 1;
        int Chainend = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > Chainend) {
                chainlength++;
                Chainend = pairs[i][1];
            }
        }
        System.out.println(chainlength);

    }
}
