package j10_StringManipulation.tasks;

public class Q03 {
    public static void main(String[] args) {

        // "Alamanya" strg. ikinci "a" karakterinin indexini bulunuz.

        String str="Alamanya";

        System.out.println(str.indexOf('a',str.indexOf('a')+1));// index büyük/küçük harfe duyarlıdır.
        //'a' değerine bakarken A' olarak bakmaz.
        // indexOf('a')+1----> 'a' dan sonraki ikinci 'a' değerini verir.





    }
}
