public class PrimeAndFibonacci {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Part a: Display prime numbers between 1 to 500
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Part b: Generate the first 10 terms of the Fibonacci sequence
        int n = 10;
        int first = 1;
        int second = 2;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
        System.out.println();

        // Part c: Find the sum of even-valued terms in the Fibonacci sequence up to four million
        int limit = 4000000;
        first = 1;
        second = 2;
        int sum = 2; // we already know that the second term is even
        while (second <= limit) {
            int third = first + second;
            if (third % 2 == 0) {
                sum += third;
            }
            first = second;
            second = third;
        }
        System.out.println("Sum of even-valued terms: " + sum);
    }
}
