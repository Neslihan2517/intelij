package java_CodeChallenge;

import java.util.Scanner;

public class C03_Challenge_2 {
    public static void main(String[] args) {

       /* Kullanıcıdan bir kelime girmesini isteyin.
       * sözcükte tek sayıda karakter veya 3 ve daha fazla karalter içeriyorsa
       * kelimenin ortasındaki karakteri yazınız.
        */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sözcük giriniz:");
        String sz= sc.nextLine().toLowerCase();

        if (sz.length()%2==1 && sz.length()>=3){
            System.out.println(sz.charAt((sz.length()-1)/2));
        }else {
            System.out.println("Sözcüğünüz tek karakterli değildir");
        }






    }
}
