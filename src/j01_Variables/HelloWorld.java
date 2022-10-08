package j01_Variables;

public class HelloWorld {
    //yorum satırı yazmak için yorum yazılacak satıra "//" işareti konur.
    // işareti tek satırlık (single line)yorum için kullanılır.

    public static void main(String[] args) {
        // sout(system.out) kodun print edilmesini sağlar.
        // bir açıklamayı birden fazla satıra (multi line) yazmak istiyorsak "/*" işaretlerini kullanırız.
        /* basarı gayrete aşıktır
        bahanesi olanın başarısı olmaz
        yorum satırları  print edilmez.
        bir kodun çalışmasını istemiyorsak kodu// içine almak gerekir.
         */
        System.out.println("merhaba dünya");
       /* System.out.println("merhaba dünya");
        System.out.println("merhaba dünya");
        System.out.println("merhaba dünya");

        */

        System.out.println("javacanlara selam olsun");
        //imlecin olduğu satır "ctrl+D" kombiyasyonu ile alt satıra kopyalanır.
       // birden çook satırı yorum içine almak için ilk satırın başına "/*" konur ve yorumun biteceği satırın sonuna enter yapılır.

    /*
    TRICK:javada cümle(satır) ";" ile bitirilir.
    Code satırının kırmızı çizgili olması "compile time error(CTE)" hatası demektir.
    CTE düzeltilmeden code yazılamaz, yazılan code çalışmaz.

     */
        System.out.print("ad: Neslihan " );
        System.out.println( "soyad: Gungor");
        System.out.println("yaş: 42");
        System.out.println("memleket: Erzurum");
        System.out.println("meslek : ogretmen");

        /*TRICK:
        print-> yazdırma işleminden sonraki komutu aynı satıra devam ettirir.
        println -> yazdırma işleminden sonraki komutu alt satıra yazdırır.
        iki satır yan yana yazılırken kavramlar arasına boşluk koymak için boşluk "" içine konulmalıdır.
        javada space (boşluk) bir karakter olarak tanılanır.
        orn: b i r-> 5 karakter
         */

        /* string: metin verileri -> metin verileri "" içine yazılmalıdır.
        int: tam sayılar -> tam sayı şeklinde veri girilmelidir.
        double: ondalik sayılar -> ondalik sayı şeklinde yazılmalıdır.
        boolean: doğru-yanlış -> =true/ =false şeklinde yazılmalıdır.

         */

        /* tanımlama(declaration) ve atama (assignment) aynı satırda yapılabileceği gibi çnce decleration sonra assignment de yaılabilir.
        assignment yapıldığını "=" işaretinden anlayabiliriz.
        orn: double salary=12500; /tek satırda her ikisi de yapılmış
        string bootcamp;
        bootcamp="clarusway" / önce declaration sonra assignment yapılmış

        birden çok aynı tip data tek komutla declare edilebilir.
        orn: String meslek, isim, memleket;
        meslek="ogretmen"
        isim="neslihan"
        memleket= "erzurum"

        aynı data türünde birden fazla variable tek komutla declare edilip değer atanabilir.
        orn: String meslek="ogretmen", isim="Neslihan", memleket="Erzurum";
         */

    }












}
