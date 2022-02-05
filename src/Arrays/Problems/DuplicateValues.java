package Arrays.Problems;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(findDups(arr));
    }

    /**
     * Brute Force Approach
     * O(N²) - Quadratic Time
     **/
    public static boolean findDups(int[] arr) {
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
