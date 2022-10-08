package j11_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        String name="haluk";
        System.out.println("car car "+ name);
        // farklı bir sınıftan method çağırabiliriz.
        C04_MethodDepo.topla(3,5);
        C04_MethodDepo.gecmeNotu(24);




selamVer();





    }// main dışı

    /* Her class'ta main method mecburiyeti yoktur.
    Belirli aksiyonlara özel classlar olabilir.

    !!! Farklı class'tan method call etmek için;
    1. method static---> gökteki güneş,
    2. className.methodName() şeklinde call edilir.
    3. Aynı class'taki method doğrudan methodName ile call edilir.

     */
    public static void selamVer(){
        System.out.println("agam selamlar dewammkee   :) ");


    }


}
