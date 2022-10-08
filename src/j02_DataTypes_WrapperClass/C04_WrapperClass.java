package j02_DataTypes_WrapperClass;

import com.sun.jdi.IntegerValue;

public class C04_WrapperClass {
    public static void main(String[] args) {


        System.out.println("madem geldin dünyana otur calıs javaya");


        //TASK: byte,short,int maximum ve minimum değerlerini print eden code yazınız.
        /* primitive datayı aksiyon methoda dönüştürmek için bunları classa çevirmek gerekir.
        Bunları Class'a çevirmek için ilk harflerini BÜYÜK yazarız.
Wrapper: saran sarmalayan/ küçük-basit yapılı bir variable'ı büyük yapılı bir Classa dönüştürür.
        !!! Classlar içinde aksiyon/method barındırır.
        !!!! Class Komutundan sonra "." konursa ilgili aksiyonları/methodları otomatik gösterir.

                 */
      //non-primitive data türleri(büyük harfle başlayanlar) data depolamak yanında kullanışlı birçok method barındırır.
      //ancak primitive data turlerinin method özelliği yoktur.
      // primitive data türleri sadece degerlei saklar ve herhangi bir özellik(method) barindirmaz.
      //Java, ihtiyaç olduğu zaman, primitive data türlerini non-primitive WrapperClass oluşturarak ara çözümler sunar.

      // TASK id ve tc değerinin toplamını print eden bir code yazınız.
      String tc="1234564";
      String id="453792";
      int yeniTc= Integer.valueOf(tc);
      int yeniId= Integer.valueOf(id);
      System.out.println(yeniId+yeniTc);


//TASK -->> byte, short,inti max ve min değerlerini print eden code yazınız.

      // WRAPPER Classlar bir işlem gerekçekleştirmek için kullanılır.
      // Basit yapıdaki primitiveleri çevreler ve işlem/aksiyon yapılabilecek duruma getirir.

      /* orn:
      byte---> type  -----------------------
                                            DECLARATION
      maxByteDeğeri---> name ---------------
      = ----->> atama (assignmant)
      Byte ---> method
      .Max_Vaule ---> değer
       */

        byte maxByteDegeri=Byte.MAX_VALUE;
        byte minByteDegeri=Byte.MIN_VALUE;
        System.out.println("maxByteDegeri="+maxByteDegeri);
        System.out.println("minByteDegeri="+minByteDegeri);


        int maxIntDegeri= Integer.MAX_VALUE;
        int minIntDegeri= Integer.MIN_VALUE;
        System.out.println("maxIntDegeri="+Integer.MAX_VALUE);
        System.out.println("minIntDegeri="+Integer.MIN_VALUE);

        short maxShortDegeri=Short.MAX_VALUE;
        short minShortDegeri=Short.MIN_VALUE;
        System.out.println("maxShortDegeri="+Short.MAX_VALUE);
        System.out.println("minShortDegeri="+Short.MIN_VALUE);



    }
}
