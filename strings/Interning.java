public class Interning {
    public static void main(String[] args) {
        String op = "Test";
        String op3 = new String("Test");
        if (op.equals(op3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }

}
