package j12_Lopps.Tasks;

import java.util.Scanner;

public class Tasks02_Polindrome {

    public static void main(String[] args) {

        //Task: girilen ifadenin polindrome(baştan ve sondan okunuşu ayını olan) olmasını kontrol eden method create ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str=sc.nextLine().toLowerCase();


        polindrome(str);




    }

    private static void polindrome(String str) {

        String ters=" "; //boş string kutusu açtım
        for (int i=str.length()-1; i>=0; i--){

            ters+=str.charAt(i); //str'in i'ninci karakterini ters'e ekleyecek(CONCAT)

        }
        System.out.println("Girilen ifadenin tersi : "+ ters);


        if (str.equalsIgnoreCase(ters)){ // str ile ters'in eşitlik durmunu

            System.out.println("Girilen ifade POLİNDROME'dur");

        }else System.out.println("Girilen ifade polindrome değildir.");

    }
}
