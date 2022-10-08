package java_CodeChallenge;

import java.util.Scanner;

public class C02_Challenge_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String a= sc.next();

        if (a.length()>=3){
            System.out.println(a.substring(a.length()-2)+a.substring(a.length()-2)+a.substring(a.length()-2));
        }else {
            System.out.println(a);
        }





    }
}
