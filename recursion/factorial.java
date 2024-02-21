public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = n * fact(n - 1);

        return ans;

    }

    public static void main(String[] args) {
        int a = 4;
        System.out.println(fact(a));
    }
}
