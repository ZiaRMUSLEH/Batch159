package day2425inheritance;

public class Honda extends Vehicle {

    public void brake(){
        System.out.println("Honda stops securely...");

    }

    public void engine(){
        System.out.println("Honda uses perfect engine...");
    }

    public Honda() {
        super();
        System.out.println("Honda Constructor");
    }
    public Honda(int year){
        super("Luxury Honda");
        System.out.println("Honda constructor with int parameter...");

    }
}