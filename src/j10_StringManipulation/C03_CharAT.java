package j10_StringManipulation;

import java.util.Scanner;

public class C03_CharAT {
    public static void main(String[] args) {

        /** charAt methodu parametre int olarak girilen indexdeki char değerini return eder.
         * !!! index değeri 0'dan başalar
         */

       // String sehir= "Istanbul";
       // sehir.charAt(5);
       // System.out.println(sehir.charAt(5));

        //son index karakteri --->> length () -1 şeklinde return ederiz.

        //System.out.println(sehir.charAt(sehir.length() - 1));

        // ilk index karakter charAt(0) return edilir


       // System.out.println(sehir.charAt(0));


        //TASK-->> istanbul kelimesinin ortadaki karakterini print eden code crete ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Kelime giriniz");
        String kelime= sc.nextLine();
        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length() - 1) / 2));

        }else System.out.println("girilen kelimenin orta karakteri yoktur");



    }
}
