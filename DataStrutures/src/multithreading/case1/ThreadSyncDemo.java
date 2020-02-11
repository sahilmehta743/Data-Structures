package multithreading.case1;

public class ThreadSyncDemo {
    public static void main(String[] args) {
        Sender sender = new Sender();

        MyThread myThread1 = new MyThread(sender, "msg1");
        MyThread myThread2 = new MyThread(sender, "msg2");

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }
}
