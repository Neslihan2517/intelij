package j08_ifStatament_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;
import java.util.SortedMap;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz:");
        int yas=sc.nextInt();
        System.out.println("Lütfen kilonuzu giriniz: ");
        int kilo=sc.nextInt();
        if (yas<18){
            System.out.println("Kan bağışı yapabilmek için 18 yasindan büyük olmalisiniz");
        } else if (kilo<50) {
            System.out.println("Kan bağışı yapabilmek için 50kg'dan ağır olmalisiniz");

        }else {
            System.out.println("Kan bağısı yapabilirsiniz");
        }
    }

}
