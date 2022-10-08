package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen not değerini aşağıdaki tabloya göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu giriniz : ");
        int not = scan.nextInt();

                if (0<=not && not<50){
                    System.out.println("Notunuz : D ");
                    System.out.println("Şİmdilik olmadı.Bir dahaki sefere");

                } else if (50<=not && not<60) {
                    System.out.println("Notunuz : C");
                    System.out.println("Biraz daha gayret");
                } else if (60<=not && not<80) {
                    System.out.println("Notunuz : B");
                    System.out.println("Güzel! Böyle devam et");

                }else {
                    System.out.println("Notunuz : A");
                    System.out.println("Başarın gözllerimizi kamaştırdı");
                }




    }


}
