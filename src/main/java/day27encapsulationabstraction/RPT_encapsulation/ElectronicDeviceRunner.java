package day27encapsulationabstraction.RPT;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {

        ElectronicDevice obj = new ElectronicDevice();
        System.out.println(obj.getSerialNo());
       // obj.setSerialNo(1234567);
        System.out.println(obj.getSerialNo());

       // obj.setSerialNo(4545454);
        System.out.println(obj.getSerialNo());

        Iphones myIphone = new Iphones();
        System.out.println(myIphone.getSerialNo());
     //   myIphone.setSerialNo(456421545);
        System.out.println(myIphone.getSerialNo());

        System.out.println(obj.add(5));
        System.out.println(obj.add(4, 6));

    }   }
