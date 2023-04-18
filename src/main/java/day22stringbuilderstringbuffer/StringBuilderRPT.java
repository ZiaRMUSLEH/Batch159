package day22stringbuilderstringbuffer;

public class StringBuilderRPT {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("jav a");
        //                                     01234
        System.out.println(stb.toString()); // jav a

        int lstIdx = stb.lastIndexOf("a");
        System.out.println(lstIdx); //7

        int lstIdx1 = stb.lastIndexOf("a", 2);
        System.out.println(lstIdx1); //1

        int idx = stb.indexOf("j");
        System.out.println(idx); //0

        int idx1 = stb.indexOf(" ",1);
        System.out.println(idx1); // 1

        stb.replace(2, 2, "tom");
        System.out.println(stb);//jatomv a

        stb.reverse();
        System.out.println(stb);// a vmotaj

        stb.insert(2,"F");
        System.out.println(stb); // a Fvmotaj

        stb.insert(2, "tomandjerry", 1,5);
        System.out.println(stb);// a omanFvmotaj

        stb.append("is not true");
        System.out.println(stb);// a omanFvmotajis not true

        StringBuilder stb1 = new StringBuilder(" omanFvmotajis not true");

        int compare = stb.compareTo(stb1);
        System.out.println(compare);// 65 ... ASCII VALUE

        stb.delete(0, 13);
        System.out.println(stb);//is not true
    }
}
