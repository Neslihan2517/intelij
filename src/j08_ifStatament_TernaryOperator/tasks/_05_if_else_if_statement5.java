package j08_ifStatament_TernaryOperator.tasks;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

double s1=90.25;
double s2=90.25;
if (s1>s2){
    System.out.println("Hello Word");
} else if (s1<s2) {
    System.out.println("Not Hello Word");

}
else System.out.println("I Love Java");


    }
}
