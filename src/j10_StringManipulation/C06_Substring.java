package j10_StringManipulation;

import java.util.Scanner;

public class C06_Substring {

    public static void main(String[] args) {

       String str="java bileninin sırtı yere gelmez";
        System.out.println(str.substring(10));
        //str datasının son 10 karakterini print ediniz.
        System.out.println(str.substring(str.length()-10));
        //str datasının ilk 10 karakterini yazdırınız
        System.out.println(str.substring(0,10));
        //str datasının ilk karakterini yazdırınız.
        System.out.println(str.substring(0,1));

        //TASK: girilen 4 harfli kelimeyi tersten print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen dört harfli bir sözcük giriniz: ");
String s1=sc.nextLine();
if (s1.length()!=4){

    System.out.println("4 harfli bir sözcük giriniz");
}else {
    System.out.println(s1.substring(s1.length()-1)+s1.substring(2,3)+s1.substring(1,2)+s1.substring(0,1));
}





    }
}
