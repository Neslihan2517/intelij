package java_CodeChallenge;

import java.util.Scanner;

public class C03_Challenge_1 {
    public static void main(String[] args) {

/* name1 name2 değişkenlerini oluşturun
name 1 değişkeninin karakter sayısı çift ise kelimenin ortasına name2 yi yerleştirin.
name 1 değişkeninin karakter sayısı tek ise "name1 çift sayılı olmadığından name2 yerleştirilemedi.

 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen name1 giriniz:");
        String name1= sc.nextLine().toLowerCase();
        System.out.println("Lütfen name2 giriniz:");
        String name2= sc.nextLine().toLowerCase();

        if (name1.length()%2==0){//name1'in çift olup olmadığı kontrol edildi.
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));

        }else {
            System.out.println("name1 çift sayılı olmadığından name2 yerleştirilemedi.");
        }







    }
}
