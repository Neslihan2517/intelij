package j11_MethodCreation;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        //Task---> girilen iki sayıyı seçilen dört işleme göre hesaplayan method yazınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz:");
        int s1 = sc.nextInt();
        System.out.println("2.sayıyı giriniz:");
        int s2 = sc.nextInt();
        System.out.println("lütfen yapmak istediğiniz işlemi giriniz:");
        char islem = sc.next().charAt(0);

        islemMenu(islem, (int) s1, (int) s2);


    }
    private static void islemMenu(char ch, int x, int y) {
        switch (ch){
            case '+':
                topla(x,y);
            case '-':
                cıkar (x,y);
                break;
            case '*':
                carp(x,y);
                break;
            case '/':
                bol(x,y);
                break;
            default:
                System.out.println("Hatalı secim");
        }
    }
    public static void topla(int a,int b){
        System.out.println("a+b ="+ (a+b));
    }
    public static void cıkar(int a, int b) {
        System.out.println("a-b =" + (a - b));

    }
    public static void carp(int a, int b) {
        System.out.println("a*b =" + (a * b));
    }
    public static void bol(int a, int b) {
        System.out.println("a/b =" + (a/b));

    }
}


    
