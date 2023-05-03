package day28interfacescollections.interfacesRPT;

public interface Size extends Cellphones {
    void size();
    int a = 6;

    int calculator();
    default void carry (){
        System.out.println("you can carry it in your pocket");
    }

    static void music (){
        System.out.println("you can play music");
    }
}
