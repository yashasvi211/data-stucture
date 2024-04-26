package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Logger temp1 = Logger.getInstance();
        System.out.println(temp1);

        temp1.a = 13;
        Logger temp2 = Logger.getInstance();
        System.out.println(temp2);
    }
}
