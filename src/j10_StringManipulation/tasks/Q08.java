package j10_StringManipulation.tasks;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("bir strg gir:");
        String a= sc.nextLine();

                System.out.println("istediğin karakter için bir index gir:");
                int x=sc.nextInt();

                if (a.length()>=x){
                    System.out.println("girdiğiniz strgin indexi: "+a.charAt(x));




                }else {
                    System.out.println("Lütfen girdiğiniz strge uygun bir index giriniz");
                }




    }




}
