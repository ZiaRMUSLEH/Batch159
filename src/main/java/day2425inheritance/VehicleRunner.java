package day2425inheritance;

import day24inheritance.Accord;

public class VehicleRunner {

    public static void main(String[] args) {

        Civic myCivic= new Civic(true);

        myCivic.brake();
        myCivic.engine();
        myCivic.ecoSystem();
        int hashCode= myCivic.hashCode();

        System.out.println("hashCode = " + hashCode);

        Accord myAcc= new Accord();

        myAcc.turboSystem();
        myAcc.brake();
        myAcc.move();

    }

}