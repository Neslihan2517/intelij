package j10_StringManipulation;

public class C08_Equals {
    public static void main(String[] args) {

        //iki string metnin birbirine eşit olup olmadığını değerlendirir.
        //Büyük küçük harf farkı vardır.
        //sonuc boolean olarak(true/false) yazdırır.
        //!! equalsIgnorcase() aynı işi yapar fakat büyük küçük harf duyarlılığı yoktur!!


       /* String str1= "Merhaba";
        String str2= "merhaba";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));

        System.out.println(str2.equalsIgnoreCase(str1));
        System.out.println(str1.equalsIgnoreCase(str2));

        */


        String s1= "songül hanım";//string pool--- basit
        String s2= "songül hanım";//string pool---basit
        String s3=new String("songül hanım") ;//obj. nonprimitive----heap memory
        String s4=new String("songül hanım");//obj. nonprimitive----heap memory
        System.out.println(s1==s2);//==karşılaştırma herşeyine bakar.s1 ve s2 basit yapılı olduğundan bulundukları referans değerleri de eşittir.
        System.out.println(s1.equals(s2));//.equals sadece değerleri karşılaştırır.
        System.out.println(s3==s4);// obj.non-primitive olduklarından hafızadaki yerleri farklıdır. Bu nedenle eşit olamazlar.
        System.out.println(s3.equals(s4));// .equals sadece değerleri karşılaştırdığı için eşit çıkacaktır.











    }
}
