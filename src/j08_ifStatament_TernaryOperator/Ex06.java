package j08_ifStatament_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        //kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        //      kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        //      kontrol edip kalan yıl ve prim gununu print eden code create ediniz.
        /* Bağımlı if yapıları için "inner(iç içe if)" yapısını kullanırız

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Cİnsiyet\n KADIN için -> K\n ERKEK için -> E\n Giriniz");
        char cns = sc.next().charAt(0);

        if (cns == 'K') {//Cinsiyetin kadın olması kontrol edildi.
            System.out.println("Yasınızı Giriniz");
            int yas = sc.nextInt();
            if (yas > 60) {// Yasın 60tan büyüklüğü kontrol edildi.

                System.out.println("Prim gününüzü giriniz:");
                int primGunu = sc.nextInt();//Prim günü kontrol edildi.
                if (primGunu > 6000) {
                    System.out.println("Emekliliğe Hak Kazandınız");

                } else System.out.println("Emekliliğiniz için :" + (6000 - primGunu) + "yatırmanız gereklidir");

            } else System.out.println("Emekliliğinize :" + (60 - yas) + "yılınız var");


        } else if (cns == 'E') {
            if (cns == 'E') {
                System.out.println("Yasınızı Giriniz");
                int yas = sc.nextInt();
                if (yas > 65) {

                    System.out.println("Prim gününüzü giriniz:");
                    int primGunu = sc.nextInt();
                    if (primGunu > 7000) {
                        System.out.println("Emekliliğe Hak Kazandınız");

                    } else System.out.println("Emekliliğiniz için :" + (7000 - primGunu) + "yatırmanız gereklidir");

                } else System.out.println("Emekliliğinize :" + (65 - yas) + "yılınız var");


            }


        }else System.out.println("Lütfen cinsiyet belirtiniz");
    }
}
