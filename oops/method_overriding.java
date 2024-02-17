public class method_overriding {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eat Meat or Grass");
    }
}

class Cow extends Animal {
    void eat() {
        System.out.println("Eat Grass");
    }
}