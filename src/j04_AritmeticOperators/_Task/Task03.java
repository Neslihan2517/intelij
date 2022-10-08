package j04_AritmeticOperators._Task;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		
Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen üç basamaklı bir sayı giriniz:");

		int a= (sc.nextInt()/100);
		int b=(sc.nextInt()%10);
		int snc=(a+b);
		System.out.println(snc);

		
	}

}
