package j12_Lopps.L01_forLoops;

public class L03_NestedForLoop {

    public static void main(String[] args) {

// Eğer bir döngünün bodysinde başka bir döngü varsa bu tür döngülere "NESTEDLOOP"(iç içe döngü) denir.

        //!!!! İç döngü, dış döngünün her adımında tekrar çalışır.

        // !!!!!!!!!!!! İç içe döngülerde en içteki döngü en önce çalışır.
        // içteki döngü tamamlanmadan dış döngü çalışmaz


        for (int i=1; i<=10; i++){// Dış döngümüz

            System.out.println("dıs dongu:" +i);

            for (int j=1; j<6; j++){//İç döngümüz

                System.out.println("i"+i+ "için iç döngü j"+j);
            }

        }





    }
}
