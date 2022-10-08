package j12_Lopps.Tasks;

import java.util.Scanner;

public class Tasks04 {

    public static void main(String[] args) {


        //girilen iki sayı arasındaki çift sayıları print eden code create ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("birinci sayı:");
        int a= sc.nextInt();
        System.out.println("ikinci sayı:");
        int b= sc.nextInt();

        for (int i=a; i<b; i++ ){
            System.out.print(i%2==0? i+" ":"ben tekim"+" ");
        }
        System.out.println("işlem bitti");

    }
}
