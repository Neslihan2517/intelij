package j04_AritmeticOperators.AritmeticOperator;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

Scanner input=new Scanner(System.in);
        System.out.println("lütfen num1 giriniz:");
        int num1=input.nextInt();
        System.out.println("lütfen num2 giriniz:");
        int num2= input.nextInt();
        System.out.println("lütfen num3 giriniz:");

        int num3= input.nextInt();
        System.out.println(num1+num2+num3);
    }
}
