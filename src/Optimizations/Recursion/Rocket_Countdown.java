package Optimizations.Recursion;

public class Rocket_Countdown {
    public static void main(String[] args) {
        countdown_improved(10);
    }

    /**
     * Loop Approach
     **/
    private static void countdown(int n) {
        for (int i = 0; i < n; i++) System.out.println(i);
    }

    private static void countdown_improved(int n) {
        System.out.println(n);
        if (n == 0) return;//base case or terminating condition
        else countdown_improved(n - 1);
    }
}
