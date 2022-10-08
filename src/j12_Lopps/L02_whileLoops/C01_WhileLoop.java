package j12_Lopps.L02_whileLoops;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
        başlangıç ve bitiş değerleri net-bilinen- tekrarlarda forLoop
        adım sayısı belli olmayıp bir şarta-duruma- bağlı tekrarlarda whileLoop kullanılır.
         */
      // Task:11'den 20'ye kadar olan tam sayıları print eden code create ediniz.
        System.out.println("*** for çözüm ***");
      for (int i=11; i<21; i++){
          System.out.println(i+ " ");
      }

        System.out.println("*** while çözüm *****");
      int a=11;

      //     başla
      while (a<21){// a sayısı 21'den küçük olduğu sürece body çalıştır.
          System.out.println(a+ " ");// aksiyon
          a++;// bitir

      }

      // Task: 7 kez JAVACAN print eden code create ediniz.

        int x=1;
      while (x<8){
          System.out.println("JAVACAN");
          x++;// bitiş değeri olmazsa şart sonsuz döngüye girer
              // bitiş değeri

          //Task3: İki basamaklı tek sayıları yan yan print eden code create ediniz.



      }
        int y=11;
        while (y<100){
            System.out.print(y + " ");
            y+=2;
        }





    }
}
