package j12_Lopps.Tasks;

import java.util.Scanner;

public class Tasks12 {

    public static void main(String[] args) {

        /*
        Task: girilen beş sayının( sayılar tekrarlı biçimde girilecek---for--) 10 ile 20 arası hariç(şart oluştur--if--)
         diğerlerinin toplamını(sayıları atayabilmek için önce boş --değeri 0 olan--- bir int.oluşturmalısın)
        hesap eden code create ediniz.

         */
        Scanner sc=new Scanner(System.in);
        int a= 0;// ilk değeri 0 girince for'dan aldığını buraya atayabilecek(boş int kutusu oluşturmuş oldum)

       for (int i=1; i<=5; i++){
           System.out.println(" Sayı giriniz : ");
           int x= sc.nextInt();
           if (x<10 || x>20){
               a+=x;

           }

       }
        System.out.println("girdiğiniz sayıların istenen şartta toplamı :"+a);

    }
}
