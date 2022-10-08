package j08_ifStatament_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç adet ürün aldınız:");
        int urn = sc.nextInt();
        System.out.println("Ürününüzün liste fiyatını giriniz:");
        int lst = sc.nextInt();
        System.out.println("Müsteri kartınız var mı?" +" Var=Ture "+ "Yok=False"+"Yazınız");
        boolean krt = sc.nextBoolean();

        if (krt == true & urn>10) {

            System.out.println("%20 indirim aldınız. Ödeyeceğiniz miktar: " + ((urn * lst) - (urn * lst * 20) / 100));



        } else if (krt==false & urn>10) {

            System.out.println("%15 indirim aldınız. Ödeyeceğiniz miktar: " + ((urn * lst) - (urn * lst * 15) / 100));




        } else {
            System.out.println("%10 indirim aldınız. Ödeyeceğiniz miktar: " + ((urn * lst) - (urn * lst * 10) / 100));

        }


    }

}
