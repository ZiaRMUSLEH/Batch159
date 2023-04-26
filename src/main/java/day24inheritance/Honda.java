package day24inheritance;

public class Honda extends Vehicle {

    public void brake(){
        System.out.println("Honda stops securely...");

    }

    public void engine(){
        System.out.println("Honda uses perfect engine...");
    }

    public Honda() {
        System.out.println("Honda Constructor");
    }
}