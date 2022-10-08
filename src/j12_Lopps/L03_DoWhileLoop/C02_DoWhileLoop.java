package j12_Lopps.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // Task: girilen sayı 17'den kücük ise KAZANDINIZ, büyük ise KAYBETTİNİZ print eden code creat ediniz

        Scanner sc=new Scanner(System.in);

        int a= sc.nextInt();

        do{


            System.out.println("KAZANDINIZ");

            a++;

        }while(a<17);

        System.out.println("kaybettiniz");




    }
}
