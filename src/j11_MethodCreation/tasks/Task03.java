package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
cevir(3, 3600);
		System.out.println("Oldu gibi");
		cevir1(2,2000);
		cevir2(5,1.609344);

	}
	public static void cevir(int a, int b){
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int sa=sc.nextInt();
		int sn=sa*3600;
		System.out.println("Girdiğiniz saatin saniye değeri:" +sn+" "+"saniyedir");
	}
	public static void cevir1(int x, int y) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int kg = sc.nextInt();
		int gr = kg * 1000;
		System.out.println("Girdiğiniz kilogramın gram değeri:" + gr +" "+ "gramdır");
	}
	public static void cevir2(double n,double m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		double ml = sc.nextInt();
		double km = ml * 1.609344;
		System.out.println("Girdiğiniz milin kilometre değeri değeri:" + km +" "+ "kilometredir");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
