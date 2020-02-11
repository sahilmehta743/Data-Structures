package concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMap extends Thread {
    static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("Child thread updating map...");
        concurrentHashMap.put(103, "C");
    }

    public static void main(String[] args) throws InterruptedException {
        concurrentHashMap.put(101, "A");
        concurrentHashMap.put(102, "B");

        MyConcurrentHashMap t = new MyConcurrentHashMap();
        t.start();

        Set set = concurrentHashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = (Integer) iterator.next();
            System.out.println("Main thread iterating map and current entry is: "
                    + next + ":" + concurrentHashMap.get(next));
            Thread.sleep(4000);
        }
        System.out.println(concurrentHashMap);
    }
}