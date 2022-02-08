package Optimizations.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    /**
     * Recursive Function
     **/
    private static int factorial(int n) {
        if (n == 1) return 1;//Base Case or Terminating CCondition
        else return n * factorial(n - 1);
    }
}
