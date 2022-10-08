package j12_Lopps.Tasks;

import java.util.Scanner;

public class Tasks03_Faktoriyel {


    public static void main(String[] args) {
     // girilen sayının faktoriyelini hesaplayan method create ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz:");
        int a= sc.nextInt();

        faktoriyel(a);




    }

    private static void faktoriyel(int a) {
      int fk=1;
        for (int i= 1; i<=a; i++){

            fk *=i; //i değerinin integer değerimle aksiyona girbilmesi için atama yaptım


        }
        System.out.println("Faktoriyel :"+fk);



    }
}
