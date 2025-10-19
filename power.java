package _5_Recursion;

public class power {
     // Recursive function to calculate x^n
    public static int power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1; // x^0 = 1
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(x + "^" + n + " = " + power(x, n));
    }
}
/*
 package _5_Recursion;

public class PowerCalc {

    // Optimized recursive function (divide and conquer)
    public static long power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // If n is even
        if (n % 2 == 0) {
            long half = power(x, n / 2);
            return half * half;
        } 
        // If n is odd
        else {
            return x * power(x, n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(x + "^" + n + " = " + power(x, n));
    }
}

 */
