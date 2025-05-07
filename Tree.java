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
    public void traversePreOrder(){
        traversePreOrder(root);
    }

    public void traversePreOrder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.value);
        traversePreOrder(node.leftChild);
        traversePreOrder(node.rightChild);
    }
    public void traverseInOrder(){
        traverseInOrder(root);
    }

    public void traverseInOrder(Node node){
        if (node == null){
            return;
        }
        traverseInOrder(node.leftChild);
        System.out.println(node.value);
        traverseInOrder(node.rightChild);
    }


}
