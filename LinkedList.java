import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevios(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public void addLast(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (last == first) {
            first = last = null;
        } else {
            var previos = getPrevios(last);
            last = previos;
            last.next = null;
        }
        size--;
    }

    public int[] toArray() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        int[] arr = new int[size];
        var current = first;
        int counter = 0;
        while (current != null) {
            arr[counter] = current.value;
            current = current.next;
            counter++;
        }
        return arr;
    }

    public void reverse() {

        var previous = first;
        var current = first.next;
        last = first;
        last.next = null;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (k > size){
            throw new NoSuchElementException();
        }
        var a = first;
        var b = first;

        for (int i = 0; i < k - 1; i++)
            b = b.next;

        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}





























