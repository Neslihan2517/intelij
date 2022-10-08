package j10_StringManipulation.tasks;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /* Girilen strg. son karakterini silen kod

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz:");
        String a= sc.nextLine();

        System.out.println( a.substring(0,a.length()-1));





    }
}
