package day24inheritance;

public class Animal {

    /*
    1) Inheritance helps us to avoid
    i)Repetition
    ii)Difficulty in updating codes
    iii)Difficulty in fixing codes
    iv) Preventing atomic structure

    2) Child classes can use methods or variables from Parent Class but
    Parent Class cannot use methods or variables from child class

    3) For "public" and "protected" access modifiers, there is no limitation to reach out the data
       For "default" access modifier, if the object and the parent class are in the same package the inheritance is
       possible.
       But if the object and the parent class are in different packages inheritance is impossible.

    4) For "private" access modifier, inheritance is impossible.
    5) "HAS-A" means the relationship "from parent to child", "IS-A" means the relationship "from child to parent"
    6) In Java, you cannot have multiple "Parent Classes".Because java will get confused from which parent it will use the
    required common methods.

     */

    public void eat(){

        System.out.println("Animals eat...");

    }
    public void drink(){
        System.out.println("Animals drink...");
    }


}