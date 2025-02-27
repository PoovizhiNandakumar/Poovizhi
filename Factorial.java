public class Factorial {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5; // Change this number to test other values
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}

