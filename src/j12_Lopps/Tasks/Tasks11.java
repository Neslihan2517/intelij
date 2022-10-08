package j12_Lopps.Tasks;

public class Tasks11 {

    public static void main(String[] args) {


        /*

        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F

        şeklini yazdırınız:
       A'nın ascıı değeri=65
(Satırlarla artıyor sütunlar  değişiyor)
         */

        int harf=65;

        for (int i=0; i<6; i++ ){
            for (int j=0; j<=i; j++){// j<=i ---->satır sayısı kadar sütun oluştur
                System.out.print((char)(harf+j)+ " " );// type casting ile int değeri olan ascıı değerini char karaktere cevirdik

            }
            System.out.println();
        }



    }
}
