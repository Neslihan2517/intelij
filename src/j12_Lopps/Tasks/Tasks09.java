package j12_Lopps.Tasks;

import java.util.Scanner;

public class Tasks09 {

    public static void main(String[] args) {

        /*
        Task: girilen boyutta aşağıdaki şekli print eden code create ediniz.
        *
        **
        ***
        **** //kaçıncı satırdaysan o kadar şeklin olacak----1.satır 1 şekil/2.satır 2 şekil ...

         */

        Scanner sc=new Scanner(System.in);
        System.out.println(" Bir sayı giriniz:");
        int a=sc.nextInt();

        for (int i=1; i<=a; i++){

            for (int j=1; j<=i; j++){
                System.out.print("*");//yan yana yazdırmak için .print yapıldı.
            }
            System.out.println();
        }



    }
}
