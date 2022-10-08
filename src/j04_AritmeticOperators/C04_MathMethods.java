package j04_AritmeticOperators;

public class C04_MathMethods {
    public static void main(String[] args) {

        /* Matematiksel işlemleri yapacağımız değişkeni oluşturalım */

        double dSayi = -29.45; //aradaki virgül değil nokta

        System.out.println("Sayının ilk değeri    : " + dSayi);

        /* Sayının mutlak değerini alalım */

        System.out.println("Sayının mutlak değeri : " + Math.abs(dSayi));
//.abs sayının mutlak değerini verir.

        /* Sayıyı yukarı yuvarlayalım */

        System.out.println("Sayı yukarı yuvarla   : " + Math.ceil(dSayi));
//.ceil  yukarı yuvarlar

        /* Sayıyı aşağı  yuvarlayalım */

        System.out.println("Sayı aşağı  yuvarla   : " + Math.floor(dSayi));
//.floor aşağı yuvarlar

        /* 81 sayısının karekökünü alalım */

        System.out.println("100'ün karekök değeri : " + Math.sqrt(81));

//.sgrt karekök alır


        /* 3  sayısının küpünü alalım */

        System.out.println("3'ün küpünün   değeri : " + Math.pow(3, 3));
//.pow küpünü alır.
    }






    }

