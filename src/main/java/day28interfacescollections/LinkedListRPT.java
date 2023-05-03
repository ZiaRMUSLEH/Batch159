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
    }

}
