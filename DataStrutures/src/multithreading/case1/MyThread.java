package multithreading.case1;

public class MyThread extends Thread {

    Sender sender;
    String msg;

    public MyThread(Sender sender, String msg) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}
