package java_CodeChallenge;

import java.util.Scanner;

public class C03_Challenge_3 {
    public static void main(String[] args) {
        //Kullanıcıdan isim ve soyismini isteyin ve hangisi daha uzun ise onu yazdırın

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz:");
String isim= sc.nextLine().toLowerCase();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim= sc.nextLine().toLowerCase();

        if (isim.length()>soyisim.length()){
            System.out.println(isim);
        } else if (isim.length()<soyisim.length()) {
            System.out.println(soyisim);


        }else {
            System.out.println(isim+" "+soyisim);
        }


    }
}
