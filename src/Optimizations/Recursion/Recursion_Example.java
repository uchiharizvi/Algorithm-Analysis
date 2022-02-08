package Optimizations.Recursion;

public class Recursion_Example {
    public static void main(String[] args) {
        int n = 700;
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        return (n == 0) ? 0 : ((n == 1) ? 1 : (n + fact(n - 1)));//Clean Code
    }
    //private static int sum
}
