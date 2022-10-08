package j08_ifStatament_TernaryOperator.tasks;

public class _01_if_statement {

    public static void main(String[] args) {

    /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.
        int a1=35;
        int a2=23;
        if (a1<a2){
            System.out.println("a1 is smaller than a2");
        } else if (a1>a2) {
            System.out.println("a1 is greater than a2");

        }
        else System.out.println("bu secenek mevcut değil");


    }
}
