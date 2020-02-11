import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackBasicExample<E> {

    private List<E> stack = new ArrayList();

    //push method
    public void push(E e) {
        stack.add(e);
    }

    //pop method
    public E pop() {
        E popValue;
        int len = size();

        popValue = top();
        stack.remove(len - 1);

        return popValue;
    }

    //top
    public E top() {
        int len = size();
        if (len == 0) {
            throw new EmptyStackException();
        }
        return stack.get(len - 1);
    }

    public boolean empty() {
        return stack.size() == 0;
    }

    private int size() {
        return stack.size();
    }

    //search
    public int search(E e) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (e == stack.get(i)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        StackBasicExample stackBasicExample = new StackBasicExample();
        stackBasicExample.push("AAAAAA");
        stackBasicExample.push("BBBBBB");
        stackBasicExample.push("CCCCCC");
        stackBasicExample.push("DDDDDD");
        System.out.println(stackBasicExample.pop());
        System.out.println(stackBasicExample.pop());

        stackBasicExample.push("EEEEEE");
        System.out.println(stackBasicExample.pop());

        StackBasicExample stackBasicExample1 = new StackBasicExample();
        stackBasicExample1.push(1);
        stackBasicExample1.push(2);
        stackBasicExample1.push(3);
        stackBasicExample1.push(4);
        System.out.println(stackBasicExample1.pop());
        System.out.println(stackBasicExample1.pop());

        stackBasicExample1.push(5);
        System.out.println(stackBasicExample.pop());

        System.out.println(stackBasicExample1.search(0));
    }
}
