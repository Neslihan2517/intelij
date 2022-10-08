package j04_AritmeticOperators._Task;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */


Scanner sc=new Scanner(System.in);
        System.out.print("Üç Basamaklı Bir Sayı Giriniz:");
        int a= sc.nextInt();
        int br=a%10;
        int yz=a/100;
        int on= (a/10)%10;
        System.out.println("Girdiğiniz Sayının birler basamağı :"+br + "onlar basamağı: " +on + "yüzler basamağı : "+yz);
// sayının /10 şeklinde yazımı 10'a bölümünden bölümü verir.-->ORN: 853/10--->>85

    }
}
