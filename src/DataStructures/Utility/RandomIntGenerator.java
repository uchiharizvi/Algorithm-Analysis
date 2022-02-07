package DataStructures.Utility;

import java.util.Random;


public class RandomIntGenerator {
    public static int generateInteger(int start, int n) {
        Random r = new Random();
        int low = start;
        int high = n;
        return r.nextInt(high - low) + low;
    }
}

