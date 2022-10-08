package j04_AritmeticOperators.AritmeticOperator;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen num1 giriniz:");
        int num1=input.nextInt();
        System.out.print("lütfen num2 giriniz:");
        int num2= input.nextInt();
        int bol= num1/num2;
        System.out.println("bol="+ (num1/num2));

    }
}
