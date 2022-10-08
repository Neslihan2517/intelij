package j12_Lopps.Tasks;

import java.util.Scanner;

public class Tasks07 {
    public static void main(String[] args) {

/*
Task: Girilen boyutta bir kare için
girilen:6
1 0 0 0 0 0
0 1 0 0 0 0
0 0 1 0 0 0
0 0 0 1 0 0
0 0 0 0 1 0
0 0 0 0 0 1

 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
int a=sc.nextInt();

        for (int i=1; i<=a ; i++){
            for (int j=1; j<=a; j++){

                if (i==j){
                    System.out.print("1 ");
                }else System.out.print("o ");
            }
            System.out.println();


        }


    }
}
