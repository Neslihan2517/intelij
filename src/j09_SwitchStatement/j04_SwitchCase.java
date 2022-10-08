package j09_SwitchStatement;

import java.util.Scanner;

public class j04_SwitchCase {
    public static void main(String[] args) {

        // girilen ayın hangi mevsimde olduğunu print eden code create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz");
        int ayNo= sc.nextInt();
        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
            default:
                System.out.println("Sadece dört mevsim var");


                //ortak işlem yapacak case'ler için sıralı yazılabilir.
                // farklı işlemler gerektiren case'ler için "break" bağlayıcısı kullanılır.


        }







    }
}
