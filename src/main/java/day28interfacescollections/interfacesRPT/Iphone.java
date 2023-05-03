package day28interfacescollections.interfacesRPT;

/*
1) java does not support multiple inheritance for classes but
 if you put all common functionalities into a single parent class
 the parent class will be so huge which we do not want it because
 atomic structure is recommended in coding.
 2. to be able to use multiple inheritance in java, java created "interface"
 structure.  you can make multiple interfaces parent of a class, so
 for interface multiple inheritance is supported in java
 3. interface is interface, interface is not a class
 4. interface have common and mandatory functionalities.
 interfaces are to-do list for concrete child classes.
 5. methods in an interface
 all methods are abstract in interface
 all methods are public in interface
 all methods must be overriden by the concrete child classes
 6. body part of methods can create issue for the child classes in
 multiple inheritance, but we do not have any concrete methods in interfaces
 that is why there is no confusion for the child classes.
 7. variables in an interface
 all variables are final in an interface
 all variables are public in an interface
 all variables are static in an interface because we cannot create object from interfaces
 8. interfaces have abstract methods which are uncompleted codes that is why
 java does not let create objects from an interface.
 9. you can use methods with the same name but return types of the methods must be same as well.
 10. Normally we can not put method with body in an inerface but by using two keywords:
 default ==> it is ot mandatory to override
            to use default methods create object from the concrete child class
 Static ==> it is not mandatory to override
            to use static methods no need to create object use interface name
11. class==> class : extends
    interface ==> interface : extends
    class ==> interface : implements
    interface ==> class : this is impossible, a class can not be the parent of an interface

 */

public class Iphone implements Size, Solar, Uses{

    @Override
    public void size () {
        System.out.println("Iphones have small size");

    }

    @Override
    public int calculator () {
        return 0;
    }

    @Override
    public void solar () {
        System.out.println("Iphones have solar");

    }

    @Override
    public void uses () {
        System.out.println("Iphones electric energy");

    }

    @Override
    public void contact () {
        System.out.println("you can contact with cellphones");
    }
}
