public class interfaces {
    public static void main(String[] args) {
        sedan audi = new sedan();
        System.out.println(audi.price());
        System.out.println(audi.speed());
    }
}

interface car {
    int speed();

    int price();
}

class sedan implements car {

    public int speed() {
        // TODO Auto-generated method stub
        return 220;
    }

    @Override
    public int price() {
        // TODO Auto-generated method stub
        return 90;
    }
}