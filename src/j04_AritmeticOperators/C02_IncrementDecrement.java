package j04_AritmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("****Increment-> Artırma*****");
        // "++" ifadesi değeri 1 artıtır
        //++a------->>>> önce artırır sonra değere ekler.
        // a++ ------>>>> önce değeri yazar sonra bir artırır.

        int a=7;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a++ + ++a);

    }
}
