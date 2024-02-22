public class fibonacci {
    static void printFibonacci(int n, int a, int b) {
        if (n > 0) {
            System.out.print(a + " ");
            printFibonacci(n - 1, b, a + b);
        }
    }

    public static void main(String[] args) {
        int n = 10;

        printFibonacci(n, 0, 1);
    }
}
