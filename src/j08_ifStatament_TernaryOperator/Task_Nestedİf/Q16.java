package j08_ifStatament_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir numara giriniz");
        int num1= sc.nextInt();
        System.out.println("Lütfen 2. numarayı giriniz");
        int num2=sc.nextInt();
        System.out.println("Lütfen 3. numarayı giriniz");
        int num3=sc.nextInt();
        if (num1>num2 & num1>num3 & num2<num3){
            System.out.println(num1+num2);
        } else if (num1>num2 & num1>num3 & num2>num3) {
            System.out.println(num1+num3);

        } else if (num2>num1 & num2>num3 & num1<num3) {
            System.out.println(num2+num1);

        } else if (num2>num1 & num2>num3 & num1>num3) {
            System.out.println(num2+num3);

        } else if (num3>num1 & num3>num2 & num1<num2) {
            System.out.println(num3+num1);
        }else {
            System.out.println(num3 + num2);
        }

    }
}

