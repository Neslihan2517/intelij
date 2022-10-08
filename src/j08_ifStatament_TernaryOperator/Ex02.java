package j08_ifStatament_TernaryOperator;

import java.util.Scanner;

public class Ex02 {


    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        int not = sc.nextInt();
        if (not < 0 || not > 100) {
            System.out.println("0dan küçük, 100den büyük not olamaz");

        } else if (not < 50) {
            System.out.println("D");
        } else if (not < 60) {
            System.out.println("C");

        } else if (not < 80) {
            System.out.println("B");

        } else {
            System.out.println("A");


        }

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        int not = sc.nextInt();
        if (not < 0 || not > 100) {
            System.out.println("0dan küçük, 100den büyük not olamaz");

        } else if (not < 50) {
            System.out.println("D");
        } else if (not >=50 && not< 60) {
            System.out.println("C");

        } else if (not >=60 && not< 80) {
            System.out.println("B");

        } else {
            System.out.println("A");


            // "&&" ve ifadesidir.
            // "||" veya ifadesidir.
            // "!" değil ifadesidir.


        }

    }


}
