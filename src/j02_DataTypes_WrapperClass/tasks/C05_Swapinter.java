package j02_DataTypes_WrapperClass.tasks;

public class C05_Swapinter {
    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=34;
        int sayi3;
        sayi3=sayi1+sayi2;//54
        sayi1=sayi3-sayi1;//34
        sayi2=sayi3-sayi2;//20
        System.out.println("swap işlemi sonrası sayi1=sayi2");
        System.out.println("swap işlemi sonrası sayi2=sayi1");


        //2. YÖNTEM:
        int n1=20;
        int n2=34;
        n1=n1+n2;//54
        n2=n1-n2;

    }
}
