package java_CodeChallenge;

import java.util.Scanner;

public class C03_Challenge_5 {
    public static void main(String[] args) {

        //Kullanıcıdan dört harfli bir kelime isteyin ve girilen kelimeyi tersten yazdırın

        Scanner sc=new Scanner(System.in);
        String klm= sc.nextLine();


        if (klm.length()==4){
            System.out.print((klm.charAt(3)));
            System.out.print((klm.charAt(2)));
            System.out.print((klm.charAt(1)));
            System.out.print((klm.charAt(0)));
        }else {
            System.out.println("Sözcüğünüz dört harfli değil");
        }



    }
}
