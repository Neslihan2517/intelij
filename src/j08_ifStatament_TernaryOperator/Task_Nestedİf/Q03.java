package j08_ifStatament_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
Scanner sc=new Scanner(System.in);
        System.out.println("LÜTFEN BOYUNUZU GİRİNİZ: ");

        int boy= sc.nextInt()/100;

        System.out.println("LÜTFEN KİLONUZU GİRİNİZ: ");
       int kilo=sc.nextInt();

        int BMI= kilo/(boy*boy);
        if (BMI<20){
            System.out.println("Tüy gibi hafifsin");
        } else if (20<BMI) {
            System.out.println("İdeal kilondasın korumaya bak");


        } else if (25<BMI) {
            System.out.println("Haydi spora, fazlalıkları atman gerek");

        }else {
            System.out.println("Acilen bir diyetisyenle görüşmelisin");
        }

    }

}
