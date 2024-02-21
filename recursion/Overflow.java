public class Overflow {
    public static void causeStackOverflow() {
        int a = 12;
        a++;
        if (a == 1000000000) {
            return;
        }
        causeStackOverflow();
    }

    public static void main(String[] args) {
        causeStackOverflow();
    }
}
