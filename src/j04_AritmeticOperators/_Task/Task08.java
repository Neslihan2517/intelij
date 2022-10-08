package j04_AritmeticOperators._Task;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir sayı giriniz:");
        int a= sc.nextInt();
        int b=(a/3600);
        int dk=((a%3600)/60);
        int sn=(a%60);
      //  System.out.println(b);
      //  System.out.println(dk);
      //  System.out.println(sn);
        System.out.println("sayının dk değeri="+b+"s"+ " " +dk+"dk" +" "+sn + "sn");










    }
}
