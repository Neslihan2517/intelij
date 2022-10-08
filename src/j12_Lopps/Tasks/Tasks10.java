package j12_Lopps.Tasks;

import java.util.Scanner;

public class Tasks10 {

    public static void main(String[] args) {



        /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz.
        input: selam JAVACANLAR
        output: a sayısı :5
         */


        Scanner sc=new Scanner(System.in);
        System.out.println("Bİr ifade giriniz:");
        String cumle= sc.nextLine();
        System.out.println("Hangi harfin sayısını öğrenmek istiyorsunuz?");
        char harf=sc.next().charAt(0);
        int a=0;// ilk değer "0" atanırsa saymada etki etmez. İstenen değer birden başlayarak yazar.

        for (int i=0; i<=cumle.length()-1; i++){
            if (cumle.charAt(i)==harf){
                a++;
            }
        }
        System.out.println("Girdiğiniz cümle:" + cumle + "de istediğiniz harf :"+ harf +": "+ a+ "adet var");


    }
}
