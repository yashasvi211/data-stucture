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

    public void addfront(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addback(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("nulls");
    }

}

public class add {
    public static void main(String args[]) {
        ll trial = new ll();
        trial.addfront(7);
        trial.addfront(11);
        trial.addfront(4);
        trial.addfront(7);
        trial.addfront(17);
        trial.addback(10);
        trial.addback(101);
        trial.display();

        trial.display();
    }
}
