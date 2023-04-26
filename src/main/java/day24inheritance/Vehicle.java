package day24inheritance;

public class Vehicle {
    /*
    1)Every class except from "Object Class" has parent class
    2) Object Class is the "Parent Class" of all Classes in Java.
    3) Just "Object Class" does not have any "Parent Class" in Java.
     */

    public void move(){
        System.out.println("All vehicles move...");

    }
    public void pricing(){

        System.out.println("To buy a vehicle you should pay the price...");

    }

    public Vehicle() {
        System.out.println("Vehicle Constructor...");
    }
}