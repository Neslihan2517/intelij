package j10_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {


        /** Concat methodu aldığı parametre String variable'ı çalıştığı Stringin sonuna ekler
         * Java'da + işlemi yapılırken en az bir string variablı varsa toplama işlemi değil concat işlemi yapılır.
         *String methodları variable'de geçici değişiklik yapar. Değişken atama yapılırsa kalıcı olarak değişir.
         * Verilerden biri string ise concat yapılırken veriler otomatik olarak stringe çevrilir.
         */
String name= "Neslihan";
String meslek="Qa Tester";
        System.out.println(name.concat(meslek));
        System.out.println(name);
        name=meslek.concat(name);
        System.out.println("name = " + name);

        System.out.println(name.concat(true + " :)"));
        System.out.println(name.concat(100 + " :)"));

    }
}
