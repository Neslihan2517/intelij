package j08_ifStatament_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int a=sc.nextInt();

        if (a >0){
            System.out.println("sayı pozitiftir");

        } else if (a <0) {
            System.out.println("sayı negatiftir");

        }
        else System.out.println("Sayı nötrdür");

    }
}
