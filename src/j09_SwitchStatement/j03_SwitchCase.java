package j09_SwitchStatement;

import java.util.Scanner;

public class j03_SwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("agam bir ay gir bakam");
        int ayNo=sc.nextInt();


        switch (ayNo){
            case 1:
                System.out.println("ocak");
            case 2:
                System.out.println("şubat");
            case 3:
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5:
                System.out.println("mayıs");
            case 6:
                System.out.println("haziran");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("ağustos");
            case 9:
                System.out.println("eylül");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasım");
            case 12:
                System.out.println("aralık");
            default:
                System.out.println("sizin köyde kaç ay var");




        }






    }
}
