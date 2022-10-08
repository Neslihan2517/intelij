package j08_ifStatament_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

       // Task--- girilen pozitif bir sayının 2 veya daha fazla basamaklı olmasını kontrol eden code

        Scanner sc=new Scanner(System.in);
        System.out.println( "Bir sayı giriniz:");
        int sayı=sc.nextInt();
        String sonuc= sayı>9? "sayınız en az iki  basamaklı" : "sayınız tek basamaklı";
        System.out.println(sonuc);






    }
}
