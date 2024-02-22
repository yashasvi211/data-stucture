/**
 * sum_natural_no
 */
public class sum_natural_no {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Answer is " + sum(12));
    }
}