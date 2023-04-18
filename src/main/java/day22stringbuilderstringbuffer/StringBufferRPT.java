package day22stringbuilderstringbuffer;

public class StringBufferRPT {
    public static void main(String[] args) {

        StringBuffer stb = new StringBuffer("java");

        CharSequence stb1 = stb.subSequence(0,2);
        System.out.println(stb1); //ja

        StringBuffer stb2 = new StringBuffer("Java");

        int cmpr =  stb.compareTo(stb2);
        System.out.println(cmpr); // 32 ... ASCII VALUE difference

        stb.setCharAt(2, 'D');
        System.out.println(stb);// jaDa






    }
}
