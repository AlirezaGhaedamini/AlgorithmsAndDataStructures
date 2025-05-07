import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    //    10 20 30 0 0
//    f     r
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public ArrayQueue(int capacity) {
        this.items = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new StackOverflowError("Queue is full");

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        int value = items[front];
        front = (front + 1) % items.length;
        count--;
        return value;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = items[(front + i) % items.length];
        }
        return Arrays.toString(result);
    }
}
