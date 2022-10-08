package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        //concatenation: birleştirme
        String ad="Neslihan";
        String soyad="Gungor";


        int a=7;
        int b=11;

 /* Birden çok string variable ile farklı data type variablellar (int,byte,double vs)+ ile işleme alınırsa
 java birleştirme yaparak yeni bir string oluşturur.
 !!!! Birleştirme toplama değildir !!!
 orn:2 ve 1 sayılarını toplarsan 3 elde edesin,
 birleştirirsen 21 veya 12 elde edersin  :)
 **** Birleştirme stringden itibaren başlar
 !!!birleştirmede string kendinden sonraki tüm verileri stringe çevirir.
 !! önce özel yapı(mesela parantez içindeki işlemler) çalışır.



  */

        System.out.println(ad+soyad+a+b);//NeslihanGungor711
        System.out.println(ad+soyad+(a+b));// NeslihanGungor18
        System.out.println(a+ad+soyad+b);//7NeslihanGungor11
        System.out.println(a+b+ad+soyad+b);//18NeslihanGungor11------>birleşme strigle başlar, öncesinde işlem kendi şekliyle devam eder.
        System.out.println((a+b)+ad+soyad+b);//18NeslihanGungor11
        System.out.println(""+a+b);//711------>"" işareti bir stringdir.
        System.out.println(ad+(a-b)+(a-b));//Neslihan-4-4
        System.out.println(ad+((a-b)+(a-b)));//Neslihan-8

        char ch='1';
        System.out.println(ad+ch);//Neslihan1
        System.out.println(a+ch+ad);//a+ch ifadesi concat olmaz çünkü string değildir.
        // ch değeri olan 1'in ASCII değeri ile a toplanır.
        System.out.println(ad+(ch+b));//Neslihan60
        System.out.println(a+ad+ch);//7Neslihan1
        /* !! string+ch değeri yazılırken string ile ch concat olacağından
        ch'nin karakter değeri girer.
         !!! ch+a değeri yazılırken aritmetik işlem yapıldığından
        ch'nin ASCII değeri girer.bknz:37.ve 39.satırlar
         !!!! String bir aritmetik işlem içinde ise işlem önceliğine göre önce işlemler yapılır
        sonra string ile concat yapılır.


         */
    }
}
