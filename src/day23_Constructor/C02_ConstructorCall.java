package day23_Constructor;

public class C02_ConstructorCall {

          int sayi;
          String str;

    public C02_ConstructorCall() {
        System.out.println("Parametresiz constructor calisti");
    }

    public C02_ConstructorCall(int sayi) {
        this.sayi = sayi;
        System.out.println("int parametreli constructor calisti");
    }

    public C02_ConstructorCall(String str) {
        this.str = str;
        System.out.println("String parametreli constructor calisti");
    }

    public C02_ConstructorCall(int sayi, String str) {
        // C02_ConstructorCall(); boyle yazildiginda method callolarak algilar
        this();// JAVA SYNTAX OLARAK CONSTRUCTOR CALL OLARAK BUNU BELIRLEMISTIR.

        this.sayi = sayi;
        this.str = "Java";
        System.out.println("2 parametreli constructor calisti");
    }
    public static void main(String[] args){
        C02_ConstructorCall obj3 = new C02_ConstructorCall(7,"Selcuk");
        System.out.println(obj3.sayi); // 7
        System.out.println(obj3.str); // Java

        C02_ConstructorCall obj2 = new C02_ConstructorCall("Java");
        System.out.println(obj2.sayi);// 5
        System.out.println(obj2.str); // Java
        C02_ConstructorCall obj1 = new C02_ConstructorCall();


    }



}

