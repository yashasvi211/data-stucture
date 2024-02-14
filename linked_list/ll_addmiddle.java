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

    public void find(int data, int index) {
        node temp = head;
        node newnode = new node(data);
        if (index == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;

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

public class ll_addmiddle {

    public static void main(String args[]) {
        ll trial = new ll();
        trial.addfront(5);
        trial.addfront(4);
        trial.addfront(2);
        trial.addfront(1);
        trial.find(3, 0);
        trial.display();

    }
};