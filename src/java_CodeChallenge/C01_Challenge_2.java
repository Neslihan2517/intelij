package java_CodeChallenge;

import java.util.Scanner;

public class C01_Challenge_2 {


    public static void main(String[] args) {
// Kullanıcıdan ismini soyadını girmesini isteyin sonrasında konsola tam ismini büyük harfle yazdırın
        Scanner sc=new Scanner(System.in);
        System.out.println("LÜtfen adınızı ve soyadınızı giriniz: ");
        String firstName=sc.nextLine(),lastName=sc.nextLine();

        String fullName=firstName.concat(" "+ lastName).toUpperCase();
        System.out.println("fullName= " + fullName);









    }
}
