package j10_StringManipulation.tasks;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz : ");
        String ad= sc.nextLine();
        System.out.println("Lütfen soyadınızı giriniz:");
       String soyad= sc.nextLine();
        System.out.println(ad.substring(0,1).toUpperCase() +ad.substring(1));
        System.out.println(soyad.substring(0,1).toUpperCase() +soyad.substring(1));











    }
}
