import javax.swing.plaf.synth.SynthOptionPaneUI;
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
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
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

        System.out.println("testing Depth and height");

        System.out.println(tree.height());

        System.out.println("testing minimumfinder Method");
        System.out.println(tree.min());


        System.out.println("Testing the equals");
        var tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(7);

        System.out.println(tree.equals(tree2));

        System.out.println("testing the isBinarySearchMethod:");
        System.out.println(tree.isBinarySearchTree());


        System.out.println(" testing the AVLTree");
        AVLTree tree3 = new AVLTree();
        tree3.insert(30);
        tree3.insert(20);
        tree3.insert(10); // Triggers rotation (LL case)
        tree3.insert(25); // LR case
        tree3.insert(40);
        tree3.insert(50); // RR case
        tree3.insert(45); // RL case

        tree3.printInOrder();
        System.out.println();

        System.out.println("testing the heap:");
        Heap heap = new Heap(10);

        heap.insert(20);
        heap.insert(30);
        heap.insert(10);
        heap.insert(40);

        heap.print();

        System.out.println("Max: " + heap.remove());
        heap.print();

        System.out.println("Testing the Trie");

        Trie trie = new Trie();

        trie.insert("car");
        trie.insert("cat");
        trie.insert("care");

        System.out.println(trie.contains("cat"));
        System.out.println(trie.contains("can"));
        System.out.println(trie.startsWith("ca"));
        System.out.println(trie.startsWith("do"));


        System.out.println("testing the Graph");

        GraphList listGraph = new GraphList();
        listGraph.addVertex("A");
        listGraph.addVertex("B");
        listGraph.addVertex("C");
        listGraph.addEdge("A", "B");
        listGraph.addEdge("A", "C");
        listGraph.print();

        System.out.println();

        // Using Adjacency Matrix
        GraphMatrix matrixGraph = new GraphMatrix(3);
        matrixGraph.addVertex("A");
        matrixGraph.addVertex("B");
        matrixGraph.addVertex("C");
        matrixGraph.addEdge("A", "B");
        matrixGraph.addEdge("A", "C");
        matrixGraph.print();


        System.out.println("Testing the WeightedGraph");
        WeightedGraph g = new WeightedGraph();
        g.addEdge("A", "B", 5);
        g.addEdge("A", "C", 3);
        g.addEdge("B", "C", 2);
        g.addEdge("C", "D", 7);

        g.display();
    }

}





























