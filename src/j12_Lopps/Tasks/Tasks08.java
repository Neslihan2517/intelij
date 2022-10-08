package j12_Lopps.Tasks;

import java.util.Scanner;

public class Tasks08 {

    public static void main(String[] args) {

        /*
        Task: girilen boyutta kare çarpım tablosu print eden code create ediniz.
         */

        Scanner sc=new Scanner(System.in);
        System.out.println(" Bir sayı giriniz:");
        int a= sc.nextInt();

        for (int i=1; i<=a; i++){
            for (int j=1; j<=a; j++){

                System.out.print(" "+(i*j));

            }
            System.out.println();
        }


    }
}
