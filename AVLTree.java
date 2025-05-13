public class AVLTree {

    private class AVLNode {
        private int value;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value = " + this.value;
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode node, int value) {
        if (node == null)
            return new AVLNode(value);

        if (value < node.value)
            node.leftChild = insert(node.leftChild, value);
        else if (value > node.value)
            node.rightChild = insert(node.rightChild, value);
        else
            return node;

        node.height = 1 + Math.max(height(node.leftChild), height(node.rightChild));

        int balance = balanceFactor(node);

        if (balance > 1 && value < node.leftChild.value)
            return rotateRight(node);

        if (balance < -1 && value > node.rightChild.value)
            return rotateLeft(node);

        if (balance > 1 && value > node.leftChild.value) {
            node.leftChild = rotateLeft(node.leftChild);
            return rotateRight(node);
        }

        if (balance < -1 && value < node.rightChild.value) {
            node.rightChild = rotateRight(node.rightChild);
            return rotateLeft(node);
        }

        return node;
    }



    private AVLNode rotateLeft(AVLNode node) {
        AVLNode newRoot = node.rightChild;
        node.rightChild = newRoot.leftChild;
        newRoot.leftChild = node;


        node.height = 1 + Math.max(height(node.leftChild), height(node.rightChild));
        newRoot.height = 1 + Math.max(height(newRoot.leftChild), height(newRoot.rightChild));

        return newRoot;
    }

    private AVLNode rotateRight(AVLNode node) {
        AVLNode newRoot = node.leftChild;
        node.leftChild = newRoot.rightChild;
        newRoot.rightChild = node;


        node.height = 1 + Math.max(height(node.leftChild), height(node.rightChild));
        newRoot.height = 1 + Math.max(height(newRoot.leftChild), height(newRoot.rightChild));

        return newRoot;
    }


    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(AVLNode node) {
        if (node == null) return;
        printInOrder(node.leftChild);
        System.out.print(node.value + " ");
        printInOrder(node.rightChild);
    }
}
