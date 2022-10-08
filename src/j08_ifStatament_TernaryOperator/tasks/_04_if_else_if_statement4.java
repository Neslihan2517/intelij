package j08_ifStatament_TernaryOperator.tasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */
double a1=3.14;
double a2=4.654321;
if (a1<a2){
    System.out.println("a1 is smaller than a2 ");
} else if (a1>a2) {
    System.out.println("a1 is greater than a2");


}
        else System.out.println("Seçenek dışı durum");


    }
}
