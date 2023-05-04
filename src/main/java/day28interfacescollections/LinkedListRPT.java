package day28interfacescollections;

import java.util.LinkedList;

public class LinkedListRPT {
    public static void main (String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add(1, "Barby");
        names.addFirst("ziya");
        names.addLast("Ahmad");

        System.out.println("names = " + names);

        LinkedList<String> id = new LinkedList<>();
        id.add("43DD");
        id.add("56FS");
        id.add("65SVV");
        id.add("23LK");

        System.out.println("names.addAll(id) = " + names.addAll(id));
        System.out.println("names = " + names);
        System.out.println("names.addAll(0, id) = " + names.addAll(0, id));
        System.out.println("names = " + names);

        System.out.println("names.remove() = " + names.remove());
        System.out.println("names = " + names);
        System.out.println("names.remove(\"09GJG\") = " + names.remove("09GJG"));
        System.out.println("names = " + names);
        System.out.println("names.remove(1) = " + names.remove(1));
        System.out.println("names = " + names);
        System.out.println("names.removeFirstOccurrence(\"23LK\") = " + names.removeFirstOccurrence("23LK"));
        System.out.println("names = " + names);
        System.out.println("names.removeLastOccurrence(\"23LK\") = " + names.removeLastOccurrence("23LK"));
        System.out.println("names = " + names);
        System.out.println("names.removeFirst() = " + names.removeFirst());
        System.out.println("names = " + names);
        System.out.println("names.removeLast() = " + names.removeLast());
        System.out.println("names = " + names);
        System.out.println("names.removeAll(id) = " + names.removeAll(id));
        System.out.println("names = " + names);

        LinkedList<Integer> r = new LinkedList<>();
        r.add(12);
        r.add(5);
        r.add(14);
        r.add(12);
        r.add(1);
        System.out.println("r = " + r);

        System.out.println("r.pop() = " + r.pop());
        System.out.println(r);
        System.out.println("r.element() = " + r.element());
        System.out.println(r);
        System.out.println("r.poll() = " + r.poll());
        System.out.println(r);
        System.out.println("r.peek() = " + r.peek());
        System.out.println(r);


    }

}
