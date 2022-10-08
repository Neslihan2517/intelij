package j12_Lopps.L01_forLoops;

public class L01_forLoops_1 {


    public static void main(String[] args) {

//loop--> döngüler--->Belirli bir kod bloğunu birden fazla kez çalıştırmak için kullanılır.
/*for loops yazarken
1. for(
2. int i---değişkeni oluştur
3.koşul yaz
4. değişken değerini değiştir.
5.parantezi kapat ) süslü parantez aç veyazdır

***** parantez içi yazılırken her bölüm ; ile birbirinden ayrılır.
 */

//            başlan.  bit.  değişim
        //for (int i=0; i<=41; i++){ //döngü boyunca tekrarlanacak action
        //    System.out.println(i+ ". Maşallah");

        //}
        //System.out.println("Selam JavaCanlar");// for bady dışında olduğu için bir kez yazdırır
        //


        // Task: iki basamaklı tek sayıları yan yana print eden code create ediniz.

        for (int a = 11; a <= 99; a += 2) {
            System.out.print(a + " ");
            System.out.println("******");
            for (int i = 10; i < 100; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }


               /* for (i = 0; i > 10; i++) {
                ÇALIŞMAYAN LOOP
                //şartı sağlamayan for bady run olmaz. code sonraki satırdan devam eder.

                }

                */

              /*for (int i=0; i>00, i++){
                DURMAYAN LOOP
                bu for döngüsü sonsuza dek sürer çünkü şart her durmda sağlanıyor.
                }

               */
            }
        }
    }
}