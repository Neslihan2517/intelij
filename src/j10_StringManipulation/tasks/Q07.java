package j10_StringManipulation.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen isim giriniz:");
        String ad=sc.nextLine();
        String sonuc= ad.length()==3 ? ((ad.charAt(0)==ad.charAt(0)||ad.charAt(1)==ad.charAt(1)||ad.charAt(2)==ad.charAt(2))? "girdiğiniz ad 3 harfli ve ortak harfler içeriyor": "Girdiğiniz ad farklı karakterler içeriyor"):"Girdiğiniz ad 3 harfli değildir";
        System.out.println(sonuc);









    }
}