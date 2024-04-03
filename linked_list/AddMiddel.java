// File: AddMiddel.java
public class AddMiddel extends LinkedList {
    public void find(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Element found: " + data);
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found: " + data);
    }

    public static void main(String args[]) {
        AddMiddel trial = new AddMiddel();
        trial.addFront(5);
        trial.addFront(4);
        trial.addFront(2);
        trial.addFront(1);

        trial.display();
        trial.find(2);
    }
}
