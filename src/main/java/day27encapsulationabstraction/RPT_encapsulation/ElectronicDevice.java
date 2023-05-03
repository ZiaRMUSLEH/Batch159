package day27encapsulationabstraction.RPT;

public class ElectronicDevice {

public  int serialNo= 5646464;


    public final int getSerialNo () {
        return serialNo;
    }

   // public void setSerialNo (int serialNo) {
    //    this.serialNo = serialNo;
   // }

    public final int add (int a  ) {
        return a+a;
    }

    public final int add (int a , int b ) {
        return a+b;
    }
}
