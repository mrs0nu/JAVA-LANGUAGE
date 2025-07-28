class CircularDoublyLinkedList {
    // Node class
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Node head = null;
    
    // Insert multiple nodes at the end
    public void insertMultiple(int... values) {
        for (int value : values) {
            insert(value);
        }
    }

    // Insert a single node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;  // Get last node
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Forward traversal
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Backward traversal
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head.prev;  // Start from last node
        do {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        } while (temp != head.prev);
        System.out.println("(back to last node)");
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        // Insert multiple nodes at once
        cdll.insertMultiple(10, 20, 30, 40, 50,78,90);

        System.out.println("Circular Doubly Linked List (Forward):");
        cdll.displayForward();

        System.out.println("\nCircular Doubly Linked List (Backward):");
        cdll.displayBackward();
    }
}

