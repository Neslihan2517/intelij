package j08_ifStatament_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen Yılı Giriniz:");
        int yil= sc.nextInt();
        if (yil%400==0 || yil%4==0 && yil%100!=0 ){
            System.out.println("Bu yıl Fazladan bir Gününüz Var");

        }


        else System.out.println("Bu Yıl Artık Yıl Değil Siz Ona 'NOKSAN' diyebilirsiniz" );


    }
}
