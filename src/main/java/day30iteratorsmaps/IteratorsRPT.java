package day30iteratorsmaps;

import java.util.*;

public class IteratorsRPT {
    /*
    1. iterators do the same with the loops
    2. loops have infinite loop risk but iterators do not have.
    3. there are two type of iterators
                    i. iterator:
                        you can just remove the elements, it is impossible to update or add new elements
                        you can use the elements from first to the last. it has one direction.
                    ii. ListIterator:
                        you can remove the elements, update the element, add new elements.
                        you can use elements from the first to the last and from the last to the first. it is bidirectional.
     */
    public static void main (String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("tom");
        myList.add("jim");
        myList.add("clara");
        myList.add("angie");
        myList.add("mark");
        System.out.println("myList = " + myList);

        Iterator<String> itr = myList.iterator();

        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println("myList = " + myList);


        List<String> yourList = new ArrayList<>();
        yourList.add("tom");
        yourList.add("jim");
        yourList.add("clara");
        yourList.add("angie");
        yourList.add("mark");


        ListIterator<String> yit = yourList.listIterator();
        while (yit.hasNext()){
            yit.next();
        }


        while (yit.hasPrevious()){
            String el = yit.previous();
            yit.set(el +"!");
        }
        System.out.println("yourList = " + yourList);


    }
}