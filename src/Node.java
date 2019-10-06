public class Node {
    Node next,previous;
    Matrix m;

    public Node(Node next, Node previous,Matrix m) {
        this.next = next;
        this.previous = previous;
        this.m=m;
    }
}
