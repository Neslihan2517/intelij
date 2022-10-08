package j12_Lopps.L01_forLoops;

import java.util.Scanner;

public class L02_forLoops_2 {
    public static void main(String[] args) {

        //Task: girilen sayıdan yüze kadar 4'ün katı olan tamsayıları create eden code yazınız.
        Scanner sc=new Scanner(System.in);
        int sayı= sc.nextInt();
       if (sayı<0 || 100<sayı){

           System.out.println("Sayınız pozitif ve 100'den küçük olmalıdır");
       }
       else {
           for (int i=sayı; i<100; i++){
               if (i%4==0){
                   System.out.println(i+ " ");
               }

           }
       }


    }
}
