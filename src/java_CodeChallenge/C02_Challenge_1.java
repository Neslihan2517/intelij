package java_CodeChallenge;

import java.util.Scanner;

public class C02_Challenge_1 {

    public static void main(String[] args) {

        // kullanıcıdan alınan iki sözcük giriniz. bu iki kelimeyi birleştirin
        // sözcüklerin ilk harflerini atıp birleştirin

        Scanner sc=new Scanner(System.in);
        System.out.println("sözcük1: ");
        String s1=sc.nextLine();
        System.out.println("sözcük2: ");
        String s2=sc.nextLine();
        System.out.println("1. Yöntem: "+ s1 +" " + s2);
        System.out.println("2.yöntem :" + s1.concat(" " + s2));

        String a=s1.substring(1);
        String b=s2.substring(1);
        System.out.println("İlk harfler olmadan :"+ a.concat(" "+ b));







    }
}
