package java_CodeChallenge;

public class C02_Challenge_2 {

    public static void main(String[] args) {
// parsedouble harfi sayıya dönüştürür.
        String a="$ 13.99";
        String x=a.replaceAll("\\D","");
        String b= "$ 10.55";
        String y=b.replaceAll("\\D","");
        System.out.println("a+b :"+ a+b);
        System.out.println("x+y:" + x+y);


        double s1=Double.parseDouble(x);
        double s2=Double.parseDouble(y);
        double toplam= (s1+s2)/100;
        System.out.println("Toplam"  +"$"+toplam);







    }










}
