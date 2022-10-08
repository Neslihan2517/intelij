package j08_ifStatament_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {

    public static void main(String[] args) {

// tarnary operatörü şartın doğru ve yanlış durumları için kullanılır.1.kod true, 2.cod false ifade eder.

        // TASK: girilen bir tamsayınıntek-çift olamasını kontrel eden cod crate ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz: " );
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("Sayınız çifttir");
        }else {
            System.out.println("Sayınız tektir.");
        }

        /* ternary şu şekilde yazılır: şart? doğru şart: yanlış şart:

         */
       String sonuc= ( a%2==0 ? "Sayınız çift": "Sayınız tek");
        System.out.println("sonuc:" + sonuc);

        // "sonuc" şeklinde bir atama yaparsak farklı işlemlerde bunu kullanabiliriz.
        //Ternary sonucu bir atama yapılmadan sout ile doğrudan atanabilir.

    }
}
