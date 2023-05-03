package day26polymorphism.RPT;

public class CellPhones extends ElectronicDevice {
    @Override
    public void classNamePrinter() {
        System.out.println("CellPhones");
    }
    public int year(int a){
        return a+a;
    }


}
