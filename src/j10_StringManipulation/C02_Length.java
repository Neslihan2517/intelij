package j10_StringManipulation;

public class C02_Length {
    public static void main(String[] args) {


/** length methodu girilen stringin uzunluğunu/karakter sayısını return eder/çıktı verir.
 *  bütün karakterleri(boşluk,noktalama vs dahil) sayıp adedini verir.
 */

String str= "Medem geldin dünyaya otur çalış java'ya";
int strKarakter=str.length();
        System.out.println(strKarakter);
        System.out.println(str.length());

        String str1="";
        System.out.println(str1.length());
        String str2=" ";
        System.out.println(str2.length());



        String str3=null;// null hiçliği belirten bir pointer (işaretçi),bir değer değildir.Java onu tanımlayamaz.
        System.out.println(str3.length());//run time error

       // null atanan stringler String method çalışmaz!!!
      // ORN:  str3.concat(str1);

      String name; // declare edilmiş fakat atanmamış String method çalışmaz









    }
}
