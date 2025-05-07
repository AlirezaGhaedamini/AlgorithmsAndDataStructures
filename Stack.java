import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int count = 0;

    public boolean isEmpty() {
        return count == 0;
    }


    public void push(int value) {
        if (items.length == count)
            throw new StackOverflowError();

        items[count++] = value;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();

        return items[count - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }


}
