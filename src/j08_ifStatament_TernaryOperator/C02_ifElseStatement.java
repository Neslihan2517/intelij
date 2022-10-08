package j08_ifStatament_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /* TASK: girilen yaşın 18den büyüklüğünü kontrol eden code create ediniz.

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("yasınızı giriniz:");
        int yas=sc.nextInt();
        if (yas>18) {
            System.out.println("yasınız 18'den büyük");
        }
        //TASK: 18'den küçük ise ehliyet alamazsınız yazdırınız.


        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int a= sc.nextInt();
        if (a>=18){
            System.out.println("Ehliyet basvurusu yapabilirsiniz");
        } else System.out.println("yasınız 18'den büyük olmalıdır.");

        /* if şartının sağlanmadığı durumları "else" komutu ile yazdırırz.

         */

        //TASK:



    }

}
