public class Tree {
    private Node root;

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }


    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    public boolean find(int item) {
        Node current = root;
        while (current != null) {
            if (item == current.value)
                return true;
            if (item < current.value)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traversePreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        traversePreOrder(node.leftChild);
        traversePreOrder(node.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traverseInOrder(Node node) {
        if (node == null) {
            return;
        }
        traverseInOrder(node.leftChild);
        System.out.println(node.value);
        traverseInOrder(node.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    public void traversePostOrder(Node node) {
        if (node == null) {
            return;
        }
        traversePostOrder(node.leftChild);
        traversePostOrder(node.rightChild);
        System.out.println(node.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null)
            return -1;

        return 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }
    public int min(){
        return min(root);

    }
    private int min(Node node){
        if (node == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(node.value, Math.min(min(node.leftChild), min(node.rightChild)));

    }

    public boolean equals(Tree other){
        return equals(root, other.root);

    }
    private boolean equals(Node first, Node second){
        if (first == null && second == null){
            return true;
        }
        if (first != null && second != null){
            return first.value == second.value
                    && equals(first.leftChild , second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }
        return false;


    }

}





