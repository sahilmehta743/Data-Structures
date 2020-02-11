import java.util.Stack;

public class MakeQueueUsingTwoStack<T> {

    private Stack<T> stack1 = new Stack();
    private Stack<T> stack2 = new Stack();


    //enqueue
    public void enQueue(T t) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(t);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    //dequeue
    public T deQueue() {
        T t = stack1.peek();
        stack1.pop();
        return t;
    }

    public static void main(String[] args) {
        MakeQueueUsingTwoStack makeQueueUsingTwoStack = new MakeQueueUsingTwoStack();
        makeQueueUsingTwoStack.enQueue(1);
        makeQueueUsingTwoStack.enQueue(2);
        makeQueueUsingTwoStack.enQueue(3);
        System.out.println(makeQueueUsingTwoStack.deQueue());
        makeQueueUsingTwoStack.enQueue(4);
        System.out.println(makeQueueUsingTwoStack.deQueue());
        System.out.println(makeQueueUsingTwoStack.deQueue());
        System.out.println(makeQueueUsingTwoStack.deQueue());
    }
}
