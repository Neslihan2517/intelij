package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        /* Kullanıcıdan veri almak için üç adım takip edilir:
        1. adım: scanner class'dan obje create edilir.
        declare edilirken sc/input/giris yazılabilir.

         */
        //Scanner input=new Scanner(System.in);
        //!!!!! BU YAPI ÖNEMLİ ---EZBERLE!!!!!!

        /*
        2.adım: Kullanıcıdan istenen veri için bildirimde bulunur---sout
         */

        //System.out.println("lütfen adınızı giriniz:");
        //print____ Yanına yazdırır.
        //println---- Alt satıra yazdırır.

        /*
        3.adım: Kullanıcının girdiği veri data type'a göre bir variable atanır.
         */
        //String isim=input.nextLine();
        //System.out.println("isim="+isim); //kullanıcıdan gelen String tipinde "isim" verisi scan obj'ni nextLine() veriye create etmiş oldu.

// TASK---->> Kullanıcıdan girdiği değer göre kare alanı ve çevresini hesaplayan bir code create ediniz.



        //Scanner sc=new Scanner(System.in);
        //System.out.println("Lütfen bir tamsayı değeri giriniz:");

          //     int kenar=sc.nextInt();


      //  System.out.println("alan="+(kenar*kenar)+ "cevre="+(kenar*4));

        //Hata olan karakterin üzerine imleci getirdiğinde çıkan "import" yazısına tıklayınca otomatik düzeltir.


    //TASK-->> Kullanıcının günde içtiği çay ve kullandığı şeker değerine göre
      //  bir yılda kaç kg şeker kullandığını hesaplayan bir code create ediniz.

       Scanner sc=new Scanner(System.in);
       /* System.out.print("lütfen bir günde kaç bardak çay içtiğinizi belirtiniz:");
        int gcm=sc.nextInt();
        System.out.print("lütfen bir bardak çay için kaç adet şeker kullandığınızı belirtiniz(adet):");
        int gsm= sc.nextInt();
        System.out.println("gsm="+(gcm*gsm));
        System.out.print("bir yılda tüketilen şeker(gr):");
        double ysm=gsm*(1.7*365);
        System.out.println("ysm="+ ysm);

        */

        System.out.println("isminizi giriniz:");
       // char ch=sc.nextLine().charAt(0); // ".charAt(0)" kullanıcıdan gelen verinin ilk karekterini alır.
        //System.out.println("isminizin ilk harfi:"+ ch);

        String isim= sc.nextLine(); // kullanıcının girdiği tüm satırı isme atar
        String ad= sc.next(); // kullanıcının girdiği ilk ifadeyi ad'a atar.
        System.out.println("ad =" + ad);
        System.out.println("isim =" + isim);





    }
}
