package j08_ifStatament_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin

Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
Eger 10 dan buyuk ise "Buyuksun!" yazdirin
Eger 10 dan kucuk ise "Normalsin!" yazdirin

Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
Eger -10 dan buyuk ise "Negatifsin!" yazdirin
Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz:");
        int s1=sc.nextInt();

        if (s1>0 && s1>10) {

            System.out.println("Buyuksun!");

        } else if (s1>0 && s1<10) {
            System.out.println("Normalsin");

        }
        else {
            System.out.println("Sayınız 0'dan büyük olmalıdır");
        }




    }
}
