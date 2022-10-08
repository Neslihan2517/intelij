package j09_SwitchStatement;

import java.util.Scanner;

public class j05_SwitchCase_ATM_Projesi {
    public static void main(String[] args) {

        /* Bakiye (başlangıç bakiyesi 1000tl) öğrenme, para yatırma ve çekme, çıkış işlemlerinin yapıldığı bir
        ATM app.code creat ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayın .... Hoş Geldiniz");
        System.out.println("Lütfen bir işlem seçiniz");
        System.out.println("Bakiye Öğrenmek İçin -> 1\n Para Yatırmak İçin -> 2\n Para Çekmek İçin -> 3\n Çıkış İçin ->0 Giriniz");

        int a= sc.nextInt();
        int bk= 1000;
     switch (a){
         case 1:
             System.out.println("bakiyeniz :" +bk);
             break;

         case 2:
             System.out.println("Lütfen Yatırmak İstediğniz Miktarı Giriniz: ");
             int yt= sc.nextInt();
             bk+= yt;
             System.out.println("Güncel Bakiyeniz:"+bk);
             break;

         case 3:
             System.out.println("Lütfen Çekmek İstediğniz Miktarı Giriniz: ");
             int çekMik= sc.nextInt();

             if (çekMik>bk){
                 System.out.println("Yetersiz Bakiye");

             }else {
                 bk-= çekMik;
             }
             System.out.println("Güncel Bakiyeniz:"+bk);
             break;
         case 4:
             System.out.println("Bizi Teercih Ettiğiniz İçin Teşekkür Ederiz");
             break;



         default:
             System.out.println("Seçiminiz Hatalıdır.Lütfen Yeni Bir Seçim Yapınız");

        }




    }
}
