package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //Girilen haftanın gününü haftaii vaya sonu olduğunu bildiren code create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen bir gün belirtiniz:");
        String hf=sc.next().toLowerCase();//toLowerCase, girilen verideki büyük/küçük harf duyarlılığını kaldırır.
        switch (hf){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":

                System.out.println("Hafta İçi");
                break;

            case "cumartesi":
            case "pazar":

                System.out.println("Hafta sonu");
                break;

            default:
                System.out.println("günleri tükettik :)");

                // Girilen veri hangi tipte ise case o şekilde yazdırılır.
        }






    }
}
