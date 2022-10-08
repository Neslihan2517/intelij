package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
Scanner sc=new Scanner(System.in);
		System.out.println("Bir ay numarası giriniz:");
		int ay= sc.nextInt();
		switch (ay){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Girdiğiniz ay 31 gün");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Girdiğiniz ay 30 gün");
				break;
			case 2:
				Scanner out=new Scanner(System.in);
				System.out.println("Lütfen yıl belirtiniz:");
				int yl= out.nextInt();

				if (yl%4==0){
					System.out.println("Subat bu yıl 29 gün");


				}else{
					System.out.println("Subat bu yıl 28 gün");
				}
				break;
			default:
				System.out.println("Ayları tükettik");
		}
	}

}
