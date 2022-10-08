package j02_DataTypes_WrapperClass;

public class C5_SwapinterviewQuestions {
    public static void main(String[] args) {
        int s1=20;
        int s2=34;
        //Sayıları Swap/değiştirme yapmak için:
        // cözum1:
        /* boş bir variable ata,
        1.sayıyı boş variable'a tanımla
        2. sayıyı 1. sayıya tanımla
        boş variable'ı 2. sayıya tanımla


         */

        int temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("swap'tan sonra s1 ->" + s1 + "s2 ->"+ s2);

        //cozum2:
        s1=s1+s2;
        s2=s1-s2;
        s1=s1-s2;
        System.out.println("swaptan sonra s1 ->" +s1 + "s2 ->"+s2);


       /* SWAP CODE YAZDIRMA BICIMI:
        System.out.println("swaptan sonra s1 ->" +s1 + "s2 ->"+s2);
        */

    }
}
