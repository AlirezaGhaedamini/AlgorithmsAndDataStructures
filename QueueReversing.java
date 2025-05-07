import java.util.Queue;
import java.util.Stack;

public class QueueReversing {
    public void reverse(Queue<Integer> queue) {
        //        add remove iaEmpty
//        Q   10 20 30
//        S   10 20 30
//        QR  30 20 10
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
