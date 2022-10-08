package j12_Lopps.Tasks;

public class Tasks13 {
    public static void main(String[] args) {

        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        ŞEKLİNİ YAZDIRINIZ.

        (Satırlar değişiyor sütunlar artıyor. Buna göre işlem yapmak gerek)
         */

        int harf=65;

        for (int i=0; i<6; i++ ){
            for (int j=0; j<=i; j++){// j<=i ---->satır sayısı kadar sütun oluştur
                System.out.print((char)(harf+i)+ " " );// type casting ile int değeri olan ascıı değerini char karaktere cevirdik

            }
            System.out.println();
        }





    }
}
