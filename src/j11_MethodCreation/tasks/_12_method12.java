package j11_MethodCreation.tasks;

import java.util.Scanner;

public class _12_method12 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

       /* int taban=3, kuvvet=4;
        long sonuc=1;
        while (kuvvet !=0){
            sonuc *=taban;
            --kuvvet;
        }
        System.out.println("Cevap  : "+ sonuc);

        */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int a = sc.nextInt();
        int kuvvet = 0;
        int taban = 3;

        if (a%3 !=0){
            System.out.println("sayınız 3'ün katı değil");
        }
        else {
            for (int i=0; i<a; i++){
                a/=taban;

                kuvvet++;
            }
            System.out.println("Sayınız 3'ün "+ kuvvet + " . kuvvetidir.");
        }

    }
}
