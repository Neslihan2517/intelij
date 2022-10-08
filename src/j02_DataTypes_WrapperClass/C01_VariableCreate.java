package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {
      // 1. YOL(BEST PRACTICE-RECOMENDED):tavsiye edilen yöntem
      int yas= 42;
      int maas=33000;
        System.out.println(yas);//42
        System.out.println("yas");//yas
        System.out.println(maas);
        System.out.println("Nur Hanım başlangıç maası " +maas);
        /* kavramın sonuna konan "." komutları görmemizi sağlar.
        () içindeki variableın başına"+" konursa o variable açıklaması girilebilir.

         */
        //2.YOL:
        int boy=150;
        System.out.println("boyunuz" +boy);// değeri atanmamış değişkeni hiçbir aksiyonda kullanamazsınız.
        // Bir variable ile atanmamış değişkenler farklı zamanlarda kullanılamaz. Bir veriyi farklı zamanlarda kullanabilmem için variable ile atanmış olması gerekir.


        //3.YOL:
        int yevmiye,age,kilo; //birden çok aynı tipten değişkenler tanımlandı.

        age=33;
        yevmiye=1000;
        kilo=90;
        //tanımlanan değişkenlere değer atandı.
        int gunluk=1500, yil=2022, agigirlik=90;
                //bir variable bir kez tanımlanabilir.birden çok değer atanabilir
      System.out.println(yevmiye);
      System.out.println(gunluk);
    }
}
