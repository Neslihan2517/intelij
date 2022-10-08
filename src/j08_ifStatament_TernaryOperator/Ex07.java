package j08_ifStatament_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Ehliyetiniz varsa E yoksa H giriniz:");
        char eh=sc.next().toUpperCase().charAt(0);

        if (eh=='E'|| eh=='e'){

            System.out.println("Kaç Yıldır Araç Kullanıyorsunuz:");
            int yil= sc.nextInt();

            if (yil>7){
                System.out.println("Lütfen Katettiğiniz Mesafe Bilgisi Giriniz:");
                int yol= sc.nextInt();

                if (yol>= 100000){
                    System.out.println("Kontak Sizde");
                }else System.out.println("Mesafe için" + (100000-yol) +"tamamlamalısınız");

            } else System.out.println("Sürüş deneyiminizin" + (7-yil) + "yila ihtiyacı var");

            }else System.out.println("Bu işlem için ehliyetiniz olmalıdır");
        }






    }


