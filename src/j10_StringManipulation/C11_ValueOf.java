package j10_StringManipulation;

import java.util.Scanner;

public class C11_ValueOf {
    public static void main(String[] args) {

        // Intecer.valueOf() rakamlarla oluşturulmuş bir Stringi sayıya dönüştürür.

        String s1 = "123";
        String s2 = "456";
        System.out.println("s1 +s2");
        int a = Integer.valueOf(s2);
        int b = Integer.valueOf(s1);
        System.out.println(a + b);

//TASK---> Kullanıcının girdiği şifrenin
        //       * İlk harfi büyük
        //       * son karakteri sayı
        //       * uzunluğu 6 karakterden fazla
        //    özelliklerini kontrol eden bir code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Şİfrenizi giriniz");
        String sifre = sc.nextLine();

    }
}
