package java_CodeChallenge;

import java.util.Scanner;

public class C03_Challange_6 {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir String giriniz:");
        String st= sc.nextLine().toLowerCase();

//oluşturmak istediğin veriyi yaz üzerine imleçle geldiğnde Java otomatik method oluşturatım mı diyor.
      //  orn: xyzVarMi(st); şeklinde yazdığınızda buna uygun bir method oluşturuyor.

        //System.out.println(xyzVarMi(st));----> şeklinde yazdırırsan boolean sonuç yazdırman gerekir

        xyzVarMi(st);

    }

    private static void xyzVarMi(String st) {
        System.out.println(st.contains("xyz")? "true xyz mevcut": "false  xyz mevcut değil");
    }


   /* private static boolean xyzVarMi(String st) {

        if (st.contains("xyz")){
            return true;
    }else {
            return false;
        }

    */

//method type ne ise (örn: String, boolean, void ...vs) return de buna uygun olmak zorundadır.
}

