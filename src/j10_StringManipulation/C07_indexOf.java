package j10_StringManipulation;

import java.util.Scanner;

public class C07_indexOf {
    public static void main(String[] args) {

        /* indexOf()----->istenen karakteri baştan itibaren tarar.İlk indexi verir
        olmayan karakterin indexi sorgulanırsa -1 değeri verir.
        lastindexOf() -----> istenen karakteri sondan başlayarak tarar.Sondan ilk indexini verir.
        contains () ----> istenen karakteri içerip içermediğini kontrol eder. Sadece String karakteri ile kullanılır.
        endWith () -----> String, istenen karakterle biter mi onu kontrol eder.
        startWith () ---> String, istenen karakterle mi başlıyor, bunu kontrol eder.
        substring() ---> Stringi parçalamamızı sağlar. indexi girilen string karakterleri verir.
        trim() ----> Stringin başında ve sonundaki boşlukları temizler.
        replace() ---> Stringdeki bir karakteri istenen başka bir karaktere çevirir. Char için de kullanılabilir.
        replaceAll()----> seçilen karakterlerin tamamını istenen karaktere çevirir.
         */


String str="Good of school";
        System.out.println(str.indexOf('o'));//ilk indexi buldu 1
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("od"));

//index her zaman baştan başlar. Sondan başlayarak index sayılmaz.


        String isim="Neslihan Güngör";
        System.out.println(isim.indexOf("a"));
        System.out.println(isim.lastIndexOf("r"));
        System.out.println(isim.lastIndexOf("li"));



        //TASK: Girilen cümlenin
        //java içermiyor/1tane java içeriyor/birden fazla java var

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle=sc.nextLine().toLowerCase();

if (cümle.indexOf("java")==-1){//index -1 veriyorsa aranan değer yok demektir.
    System.out.println("Girilen cümle java içermiyor");


} else if (cümle.indexOf("java")==cümle.lastIndexOf("java")) { //baştan da sondan da kontrol edildiğinde aynı indexi veriyorsa bir tane vardır.
    System.out.println("Girilen cümle 1 java içeriyor");

}else {
    System.out.println("girilen cümlede birden fazla java var");
}


    }
}
