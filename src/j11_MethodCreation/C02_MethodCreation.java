package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
/*
       /Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
       /Method parantezinin icinde olusturulan variable'lara "parametre" denir.
       /Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
       /Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli


       / bir method Class'in icinde ama  main method'un disinda  cereate edilir
       / Best practice-> method'lar main method'dan sonra create edilir.

 */
        //Task--> girilen(Scann) 3 notun (int/double) ortalamasını hesaplayan method (main dışı) create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("1.notu giriniz: ");
        double not1= sc.nextDouble();


        System.out.println("2.notu giriniz: ");
        double not2= sc.nextDouble();



        System.out.println("3.notu giriniz: ");
        double not3= sc.nextDouble();

        double ortalamanız=ortalamaHesapla(not1,not2,not3);
        System.out.println("not ortalamanız : " + ortalamanız);
    }//main sonu

    private static double ortalamaHesapla(double a,double b, double c) {
        return (a+b+c)/3;
    }
}
