public class Class {
    public static void main(String args[]) {
        Pen pilot = new Pen();
        pilot.setcolor("Blue");
        pilot.settip(0.5f);
        System.out.println(pilot.color);
        System.out.println(pilot.tip);
    }
}

class Pen {
    float tip;
    String color;

    void settip(float tip) {
        this.tip = tip;
    }

    void setcolor(String color) {
        this.color = color;
    }
}
