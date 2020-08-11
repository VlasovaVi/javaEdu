package ru.victoria.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main_collection(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println("collection.size() = " + collection.size());
        collection.add("test");
        collection.add("foo");
        collection.add("foo");
        collection.add("bar");
        System.out.println("collection.size() = " + collection.size());
        collection.clear();
    }

    public static void main_list(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("foo");
        strings.add("bar");
        strings.add(1, "test");
        strings.set(0, "thetuh");
        System.out.println("strings.get(1) = " + strings.get(1));
        System.out.println(strings);
    }

    public static void main_set(String[] args) {
        Set<String> strings = new HashSet<>();
        boolean added;
        added = strings.add("foo");
        added = strings.add("foo");
        added = strings.add("bar");
        System.out.println("strings.size() = " + strings.size());

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(r.nextInt(1_000_000));
        }
        ///get sum of all numbers
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("sum = " + sum);

        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            integers.add(r.nextInt(1_000_000));
        }
        long sum2 = 0;
        for (Integer element: integers) {
            sum2 += element;
        }
        System.out.println("sum2 = " + sum2);

        long sum3 = 0;
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()){
            Integer element = it.next();
            sum3 += element;
        }
        System.out.println("sum3 = " + sum3);
    }
}
