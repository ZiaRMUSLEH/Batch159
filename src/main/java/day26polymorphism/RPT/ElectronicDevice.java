package day26polymorphism.RPT;

public class ElectronicDevice {

    private String serialNo = "TH2023FL";

    public String getSerialNo() {
        return serialNo;
    }

    public void classNamePrinter() {
        System.out.println("ElectronicDevice");
    }

    public int year(int a){
        return a*a;
    }


}
