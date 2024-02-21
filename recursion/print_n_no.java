class print_n_no {
    public static void print_no(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n + " ");
        print_no(n - 1);
    }

    public static void print_inc(int n) {
        if (n == 0) {
            return;
        }
        print_inc(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 6;

        print_inc(n);
        ;
    }
}
