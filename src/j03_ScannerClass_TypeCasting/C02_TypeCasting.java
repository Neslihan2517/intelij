package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

        /* byte < short < int < long < float < double

        Auto Widening Casting --->>>> Küçük data typeleri buyuk data typelerine java otomatik olarak yapar.

        */

        boolean basarili=true;
        double d=17;
        System.out.println("d="+d);// d=17.0auto widding

        int s1=33;
        int s2=7;
        System.out.println(s1/s2);
        /* java int.sayıyı birbirine böldüğünüzde sonucu int. olarak verir. Sonuç ondalık ise int. ondalık kısmı siler.

        !!!!! Küçük olan büyük olanın içine dahil olur.
         */

        byte b= 127;
        int i=b; //byte< int -----> auto widding
        System.out.println("i="+i);

        int num=1453;
        double d1=17;
        System.out.println("d1="+d1);
        // doble>int ---->bu durumda büyüğün dediği olur ve sonuç doble olarak verilir.

        double db=d1/num; // TRICK: iki farklı data type sayi işleme girerse java kucuk olan data type için aw yapar.
        // sonuç buyuk data type olarak verilir.
        System.out.println("db="+db);

        /* Buyuk datayi kucuk dataya cavirme işine "casting" denir.
        casting yazdırılırken sout--> ("ad="+ad) seklinde yazdirilir.
        int num3=150;
        byte b1=(byte)num3;
        System.out.println("b1="+b1)

         */
        double d2=14.53;
        int num2=(int) d2;
        System.out.println("num2"+num2);// casting yapılırken veri kaybı olur.

        int num3=150;
        byte b1=(byte)num3;
        System.out.println("b1="+b1);

        double d3=333;
        long l1= (long) d3;
        System.out.println("l1="+l1);

        double d4= 571.345;
        long l2=(long)d4;
        System.out.println("l2="+l2);


        /* !!!!!!Kullanıcı diyorsa "Scan" istiyor demektir.!!!
        Kullanıcının character girmesini istiyorsam;
        ch=scan

        !!!! nextLine kodun tüm satırını alır. ch tek character içerdiği için
        nextLine code ile "charAt"kullanılmalı
         */

        Scanner s=new Scanner(System.in);
        System.out.println("ascii değeri istediğin karakteri gir");
        char ch=s.nextLine().charAt(0);
        int chasciiDegeri=ch;
        System.out.println(ch+"'ın chasciiDegeri="+ chasciiDegeri);
    }
}
