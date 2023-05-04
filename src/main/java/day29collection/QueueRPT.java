package day29collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRPT {
    /*
    1. sometimes we need to work first added elements in a collection like in a bank customer line.
    for that kind of scenarios we prefer to use "Queue"s because "Queues" are in "First In First Out" scenarios.

    Note 1: When you create a queue if you can use LinkedList Constructor, the elements will be in "Insertion order"
    Note 2: When you create a queue if you use Priority Queue constructor, the elements will be in an order you can create.
            We will learn how to create our own logic to put elements in order.
    2. sometimes we need to work first added element and last added element in a collection.
      it means we need to work double ended.
      create Deque(Double Ended Queue) and use methods with double ends like removeFirst() and removeLast()
     */

    public static void main (String[] args) {

        Queue<String> food = new LinkedList<>();
        food.add("Milk");
        food.add("Cheese");
        food.add("Meat");
        food.add("Yoghurt");
        food.add("Jam");
        System.out.println("food = " + food);

        PriorityQueue<String> myfood = new PriorityQueue<>();
        myfood.add("Milk");
        myfood.add("Cheese");
        myfood.add("Meat");
        myfood.add("Yoghurt");
        myfood.add("Jam");
        System.out.println("myfood = " + myfood);


        Deque<String> yourfood = new LinkedList<>();
        yourfood.add("Milk");
        yourfood.add("Cheese");
        yourfood.add("Meat");
        yourfood.add("Yoghurt");
        yourfood.add("Jam");
        System.out.println("yourfood = " + yourfood);


    }
}
