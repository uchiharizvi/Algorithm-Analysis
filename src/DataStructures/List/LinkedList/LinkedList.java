package DataStructures.List.LinkedList;

public class LinkedList {
    Node head;

    /*public LinkedList(Node head) {
        this.head = head;
    }*/

    void initialize(Node node) {
        node = this.head;
    }

    void insertAtBegin() {

    }

    void insertAtEnd() {

    }

    void insertAfter() {

    }

    void deleteNode() {

    }

    void search() {

    }

    Object read(int index) {
        Node currentNode = new Node(head);
        int curr_index = 0;
        while (curr_index < index) {
            currentNode = currentNode.next;
            curr_index++;
        }
        return currentNode.data;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node("Once");
        Node n2 = new Node("Upon");
        ll.head.next = n2;
        ll.printList();

    }
}
