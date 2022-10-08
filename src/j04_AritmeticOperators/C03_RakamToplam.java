package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplam {
    public static void main(String[] args) {

        // Kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden code ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("LÜtfen üç basamaklı bir sayı giriniz:");
        int a= sc.nextInt();
        int a1=a%10; //10'a bölümden kalanı verdi---- birler basamağı
        a/=10;// bölümü verdi
        int a10=a%10;// bölümün 10'a bölümünden kalanı verdi-----onlar basamağı
        int a100= a/10;
        int toplam=a1+a10+a100;
        System.out.println(toplam);


    }
}
