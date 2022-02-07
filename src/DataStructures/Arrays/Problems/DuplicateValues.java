package DataStructures.Arrays.Problems;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(findDups_quad(arr));
    }

    /**
     * Linear Approach - Fix JS code
     * O(N) - Linear Time
     **/
    private static boolean findDups_linear(int[] arr) {
        /*int steps = 0;
        Integer[] existingNumbers = null;//check  undefined of JS
        for (int i = 0; i < arr.length; i++) {
            if (existingNumbers[arr[i]] == null) {
                existingNumbers[arr[i]] = 1;
            } else return true;
        }
        System.out.println("N : " + arr.length);
        System.out.println("Number of Steps: " + steps);
        return false;*/
        return true;
    }

    /**
     * Brute Force Approach
     * O(N²) - Quadratic Time
     **/
    public static boolean findDups_quad(int[] arr) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                steps++;
                if (i != j && arr[i] == arr[j]) return true;
            }
        }
        System.out.println("N : " + arr.length);
        System.out.println("Number of Steps: " + steps);
        return false;
    }
}
