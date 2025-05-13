public class Heap {
    private int[] items;
    private int size;

    public Heap(int capacity) {
        items = new int[capacity];
    }

    public void insert(int value) {
        if (size == items.length)
            throw new IllegalStateException("Heap is full");

        items[size++] = value;
        bubbleUp();
    }

    public int remove() {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");

        int root = items[0];
        items[0] = items[--size];
        bubbleDown();
        return root;
    }

    private void bubbleUp() {
        int index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void bubbleDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int largerChildIndex = leftChild(index);

            if (hasRightChild(index) && items[rightChild(index)] > items[largerChildIndex])
                largerChildIndex = rightChild(index);

            if (items[index] >= items[largerChildIndex])
                break;

            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChild(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChild(index) < size;
    }

    private void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int max() {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");
        return items[0];
    }

    public void print() {
        for (int i = 0; i < size; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }
}
