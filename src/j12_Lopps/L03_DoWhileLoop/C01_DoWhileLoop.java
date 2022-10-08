package j12_Lopps.L03_DoWhileLoop;

public class C01_DoWhileLoop {

    public static void main(String[] args) {

        /*
        while loop--- önce şartı kontrol edilir sonuç true ise body run edilir.
        do while loop --- önce body action çalışır sonra şart kontrol edilir. Şart true ise döngü devam eder.
        şart false ise döngü kırılır ve döngüden sonraki ilk satır çalışır.
do-While loop->  game app. de daha çok kullanılır.
Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
en az bir kez çalışır.
         */
        int yas=33;
        while (yas<33){
            System.out.println("Kırka daha "+ (40-yas) + "var");
            System.out.println("while body çalıştı");
            yas++;
        }

        do{
            System.out.println("yas 33 gayet iyi");
            System.out.println("do while body çalıştı");

            yas++;
        }while (yas<33);



    }
}
