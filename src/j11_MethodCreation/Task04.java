package j11_MethodCreation;

import j09_SwitchStatement.j05_SwitchCase_ATM_Projesi;

import java.util.Scanner;

public class Task04 {

    static Scanner sc=new Scanner(System.in);
    static int bk= 1000;

    public static void main(String[] args) {

        System.out.println("Sayın .... Hoş Geldiniz");

        System.out.println("MÖNÜ :)\n Bakiye Öğrenmek İçin -> 1\n Para Yatırmak İçin -> 2\n Para Çekmek İçin -> 3\n Çıkış İçin ->0 Giriniz");

secim();



    }

    private static void secim() {

        System.out.println("Lütfen işleminizi seçiniz:");
        int secim= sc.nextInt();
        switch (secim){
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatır();
                break;
            case 3:
                paraCek();
                break;
                case 4:
                    cıkıs();
                    break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız");

        }




    }

    private static void cıkıs() {
        System.out.println("Yine bekleriz");

    }

    private static void paraCek() {
        System.out.println("Lütfen çekmek istediğiniz miktarı giriniz:");
        int cekMik= sc.nextInt();
        if (cekMik<=bk){
            bk-=cekMik;
            System.out.println("Lütfen paranızı alınız");
            System.out.println("bakiyeniz:"+ bk);System.out.println("Isleme devam edecekseniz\n devam-->1\nçıkıs için-->0");
            int karar= sc.nextInt();
            if (karar==0){
                cıkıs();
            }else secim();

        }else {
            System.out.println("yetersiz bakiye");

        }


    }

    private static void paraYatır() {
        System.out.println("Yatırmak istediğiniz miktarı giriniz:");
        int yatMik= sc.nextInt();
        bk+=yatMik;
        System.out.println("yeni bakiyeniz:" + bk);
        System.out.println("Isleme devam edecekseniz\n devam-->1\nçıkıs için-->0");
        int karar= sc.nextInt();
        if (karar==0){
            cıkıs();
        }else secim();
    }

    private static void bakiyeVer() {

        System.out.println("Mevcut bakiyeniz:"+bk);
        System.out.println("Isleme devam edecekseniz\n devam-->1\nçıkıs için-->0");
       int karar= sc.nextInt();
       if (karar==0){
           cıkıs();
       }else secim();
    }
public static void karar(){
    System.out.println("Isleme devam edecekseniz\n devam-->1\nçıkıs için-->0");
    int karar= sc.nextInt();
    if (karar==0){
        cıkıs();
    }else secim();



}

}
