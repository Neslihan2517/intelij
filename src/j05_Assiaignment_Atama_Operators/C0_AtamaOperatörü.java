package j05_Assiaignment_Atama_Operators;

public class C0_AtamaOperatörü {
    public static void main(String[] args) {

        // =    x=8    x=8
        // +=    X+=3    X=X+3
        // -=    x-= 3    x=x-3
        //*=     x*=3    x=x*3
        // /=     x/=3    x= x/3
        // %=     x%=3     x= x%3



        int yas= 33;
        System.out.println(yas + 5); // yas'ı başka bir atama yapmadığımız için doğrudan 5'le toplar.Yas değeri aynı kalır.
        System.out.println(yas);
        System.out.println(yas+=11);//yas'ın yeni değeri 44 olur. Sonra yapılacak tüm işlemlerde yas değeri 44 alınır.
        System.out.println(yas);

    }
}
