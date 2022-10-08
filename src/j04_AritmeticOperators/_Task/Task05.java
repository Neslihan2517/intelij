package j04_AritmeticOperators._Task;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz:");
       int x=sc.nextInt();
       int dk=x*3600;
        System.out.println("girdiğiniz sayı="+dk +"saniyedir");
       int st=x*60;
        System.out.println("girdiğiniz sayı="+st+ "dakikadır");


    }

}
