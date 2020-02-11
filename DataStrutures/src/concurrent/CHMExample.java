package concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class CHMExample {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(101,"AAA");
        concurrentHashMap.put(102,"BBB");
        concurrentHashMap.putIfAbsent(103,"CCC");
        concurrentHashMap.putIfAbsent(101,"DDD");
        concurrentHashMap.remove(101,"DDD");
        concurrentHashMap.replace(101,"AAA","aaa");
        System.out.println(concurrentHashMap);
    }
}
