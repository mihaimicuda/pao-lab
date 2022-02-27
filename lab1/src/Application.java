public class Application {

    // -> single line comment
    /*
     multi line comment
     */

    /**
     * javadoc
     * @param args
     */

    /*
    access modifiers:
    - public : acces peste tot
    - protected: acces din acelasi pachet si clase care extind
    - private: doar din clasa respectiva
    - default(no modifier): acces doar din acelasi pachet

    static:
    - apartine clasei, nu instantei

    void:
    - return type(nothing)
     */

    /*
    primitive: int, short, float, double, long
    obiecte: String

    wrappers:
    int -> Integer
    double -> Double
    etc
     */

    /*
    == -> check equality
    -> returns boolean: true/false
     */

    public static void main(String[] args) {

//        int myFirstInt = 300000;
//        short myFirstShort = (short)myFirstInt;

        int bla; //-> declarare
        int blabla = 4; // -> declarare + initializare
        bla = 5; //initializare

        String str1 = args[0];
        String str2 = args[1];

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        int i3 = new Integer(3);

        int i4 = 5;
        String fromInt = i4 + "";
        int  fromStr = Integer.parseInt(fromInt);

        int i5 = i4;

        String fromInt2 = String.valueOf(i4);


        //i4 egal cu fromStr?
        boolean isI4Ok = i4 == fromStr;

        System.out.println(isI4Ok);
    }

}
