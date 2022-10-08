package java_CodeChallenge;

import java.util.Scanner;

public class C03_Challenge_4 {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız bir strigde boşluk karakterinin olup olmadığını kontrol ediniz.
        // Kullanıcıdan alacağınız bir stringin boş olup olmadığını kontrol ediniz.

        Scanner sc=new Scanner(System.in);
        String st= sc.nextLine();
        int busluk=st.indexOf(" "); //indexOf -1 sonucunu veriyorsa aranan değer yok demektir.
        //.isEmpty boş olduğunu bildirir. biz "boş değilse"yi aradığımız için başına ! koyarız

        if (busluk==-1 && !st.isEmpty()){
            System.out.println("String şartlara uygun");
        }else {
            System.out.println("String şartlara uygun değildir.");
        }



    }
}
