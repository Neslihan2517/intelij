package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün belirtiniz:");

        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();


        switch (kacıncıGun){

            case 1:
                int snc1=(kacıncıGun+(100%7));
                System.out.println("çarşamba");
                break;
            case 2:
                int snc2=(kacıncıGun+(100%7));
                System.out.println("perşembe");
                break;
            case 3:
                int snc3=(kacıncıGun+(100%7));
                System.out.println("cuma");
                break;
            case 4:
                int snc4=(kacıncıGun+(100%7));
                System.out.println("cumartesi");
                break;
            case 5:
                int snc5=(kacıncıGun+(100%7));
                System.out.println("pazar");
                break;
            case 6:
                int snc6=(kacıncıGun+(100%7));
                System.out.println("pazartesi");
                break;
            case 7:
                int snc7=(kacıncıGun+(100%7));
                System.out.println("salı");
                break;
            default:
                System.out.println("başka gün kalmadı maalesef");

        }






    }
}

