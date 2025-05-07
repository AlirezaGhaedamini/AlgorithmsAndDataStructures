import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        var test = new LinkedList();
        test.addLast(10);
        test.addLast(20);
        test.addLast(30);
        test.addLast(40);

        test.addFirst(9);

        System.out.println(test.indexOf(9));
        System.out.println(test.indexOf(20));
        System.out.println(test.indexOf(40));


        System.out.println(test.contains(200));
        System.out.println(test.contains(20));


        test.removeLast();

        System.out.println(test.size());


        System.out.println(Arrays.toString(test.toArray()));
        test.reverse();
        System.out.println(Arrays.toString(test.toArray()));

//        System.out.println(test.getKthFromTheEnd(5));

        Expression stackTest = new Expression();
        System.out.println(stackTest.isBalanced(""));

        System.out.println("QueueReversing Test:");
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        QueueReversing queueReversed = new QueueReversing();
        queueReversed.reverse(queue);
        System.out.println(queue);


        System.out.println("Testing the ArrayQueue:");
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        System.out.println(arrayQueue);
//        arrayQueue.dequeue();
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue);
        System.out.println("Peek:" + arrayQueue.peek());
        System.out.println("isEmpty:" + arrayQueue.isEmpty());

        System.out.println("Priority Queue Test.");
        PriorityQueue PQtest = new PriorityQueue();
        PQtest.add(2);
        PQtest.add(3);
        PQtest.add(4);
        PQtest.add(1);
        System.out.println(PQtest);


        System.out.println("ChatFinder(not Repeating) tester");
        CharFinder character = new CharFinder();
        System.out.println(character.findFirstNotRepeatingChar("ffllooriaann"));


        System.out.println("ChatFinder(Repeating) tester");
        CharFinder character2 = new CharFinder();
        System.out.println(character2.findFirstRepeatingChar("ffllooriaann"));


        System.out.println("HashTable Test");
        HashTable table = new HashTable();
        table.put(6,"A");
        table.put(8,"B");
        table.put(11,"C");
        System.out.println("Done");


        System.out.println("Testing the Tree");
        var tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(7);
        System.out.println(tree.find(7));


        System.out.println("testing traversePreOrder:");
        tree.traversePreOrder();

        System.out.println("testing traverseInOrder:");
        tree.traverseInOrder();

        System.out.println("testing traversePostOrder:");
        tree.traversePostOrder();





    }

}



























