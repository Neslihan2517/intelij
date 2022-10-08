package j10_StringManipulation.tasks;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sözcük giriniz:" );
        String s1= sc.nextLine();
        System.out.println("Lütfen ikinci sözcüğü giriniz");
        String s2=sc.nextLine();


        if (s1.length()%2==0){
            System.out.println(s1.substring(0,s1.length()/2)+s2+s1.substring(s1.length()/2));
        }else {
            System.out.println("s2 s1'e eklenemez");
        }












    }
}
