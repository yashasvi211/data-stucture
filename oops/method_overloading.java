public class method_overloading {
    public static void main(String[] args) {
        calculator cl = new calculator();
        System.out.println(cl.sum(1.1f, 1.1f));
    }
}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(int a, float b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

}