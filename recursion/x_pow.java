/**
 * x_pow(n)
 */
public class x_pow {
    private static int ans(int x, int n, int tmp) {
        if (n == 0) {
            return tmp;
        }
        tmp = x * tmp;
        n--;
        return ans(x, n, tmp);
    }

    private static int ans_optimized(int x, int n) {
        /*
         * This done in time o(log n)
         * We are dividing power by in half if its even and just multiply
         * the ans with n one more time if odd;
         */
        if (n == 0) {
            return 1;
        }
        int ans = ans_optimized(x, n / 2) * ans_optimized(x, n / 2);
        if (n % 2 != 0) {
            ans = x * ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 11;
        int tmp = 1;
        System.out.println(x + " to the power " + n + " is " + ans(x, n, tmp));
        System.out.println(x + " to the power " + n + " is " + ans_optimized(x, n));
    }
}