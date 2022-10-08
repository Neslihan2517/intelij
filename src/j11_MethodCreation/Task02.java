package j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        //Task---> Girilen (scn) ad ve soyadın(strg) ilk harfleri(charAt0) büyük(uppercase) diğerlerini(substrng) kucuk yapan method create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz:");
        String ad= sc.next();

        System.out.println("Lütfen soyadınızı giriniz:");
        String soyad= sc.next();

        adKontrol(ad,soyad);





    }// main sonu

    private static void adKontrol(String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println(ad + " " + soyad);

    }
    private static String adKontrol2(String ad, String soyad) {
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
        System.out.println(ad + " " + soyad);
        return ad + " " + soyad;

    }
}
