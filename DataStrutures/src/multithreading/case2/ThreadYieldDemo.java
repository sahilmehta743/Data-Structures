package multithreading.case2;

public class ThreadYieldDemo {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
