package j10_StringManipulation;

public class C09_Replase_ {

    public static void main(String[] args) {


// metin içindeki karakteri ya da metnin bir parçasını alır ve başka bir karakterle değiştirir.

        String str = "JavaCan'lara Selam Olsun java ile bolcana selam";
        System.out.println( str.replace('a', '@'));//cümledeki a'ları @ ile değiştirdi.
        System.out.println( str.replace("Can", "Kan"));





        // ReplaseFirst; sadece ilk bulunanı değiştirir.

        System.out.println( str.replaceFirst("a", "@"));





        //ReplaseAll
        //replase sadece char ve strg ile çalışır
        //replaseAll strg ile çalışır.Regular Expressionslarla çalışır.
        //   (Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str = "    javaCAN'lara selam olsun :)  java ile 123455544 offer ***   ";
        System.out.println(str.replaceAll("\\s", "+"));//++++javaCAN'lara+selam+olsun+:)++java+ile+123455544+offer+***+++
        System.out.println(str.replaceAll("\\S", "+"));//++++++++++++ +++++ +++++ ++  ++++ +++ +++++++++ +++++ +++
        System.out.println(str.replaceAll("\\w", "+"));//+++++++'++++ +++++ +++++ :)  ++++ +++ +++++++++ +++++ ***
        System.out.println(str.replaceAll("\\W", "+"));//++++javaCAN+lara+selam+olsun+++++java+ile+123455544+offer+++++++
        System.out.println(str.replaceAll("\\d", "+"));//javaCAN'lara selam olsun :)  java ile +++++++++ offer ***
        System.out.println(str.replaceAll("\\D", "+"));//++++++++++++++++++++++++++++++++++++++++++123455544+++++++++++++



        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234

        String isim = "Çigdem Merve";
        String soyad = "Şen";
        String kartNo = "1234567890123456";
        String yeniIsim = isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*");
        String yeniSoyısım = soyad.charAt(0) + soyad.substring(1).replaceAll("\\w", "*");

        String yeniKartNo = "**** **** **** ****" + kartNo.substring(12);

        System.out.println("isim-soyisim :"+yeniIsim+" "+yeniSoyısım+ " kart no : "+yeniKartNo);




    }
}
