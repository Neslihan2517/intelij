package j04_AritmeticOperators._Task;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir inek sayısı giriniz:");
        int inek= sc.nextInt();
        System.out.println("Lütfen bir koyun sayısı giriniz:");
        int kyn=sc.nextInt();
        System.out.println("Lütfen bir tavuk sayısı giriniz:");
        int tvk=sc.nextInt();

int ay=inek*4;

int kay=kyn*4;

int tay=tvk*2;
        System.out.println("TOPLAM AYAK SAYISI=" +(ay+kay+tay));


    }

}
