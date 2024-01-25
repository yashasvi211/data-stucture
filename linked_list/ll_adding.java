
class ll {
    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;

    public void add(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void display() {
        node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ll_adding {

    public static void main(String args[]) {
        ll trial = new ll();
        trial.add(7);
        trial.add(11);
        trial.add(4);
        trial.add(7);
        trial.display();

    }
};