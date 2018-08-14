public class MinHeap {
    private Node root;

    public MinHeap(int n) {
        root = new Node(n);
    }

    public void push(int n) {

    }

    public int pop() {
        //postorder
        return 0;
    }
}

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int n) {
        value = n;
        left = null;
        right = null;
    }
}