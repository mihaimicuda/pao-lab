import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.*;

public class FourthApplication {

    /*
    generate number between 1 and 10
    if odd number -> return true
    if even number -> return false
     */

    /*
    static method does not need an object
     */
    public static void main(String[] args) {

        FourthApplication app = new FourthApplication();
        Random randomGenerator = new Random();

//        for (int i = 0; i < 100; i++) {
//            int rand = randomGenerator.nextInt(10);
//            System.out.println(rand + " is " + app.getEvenOdd(rand));
//            //din obiect putem apela metode statice pentru ca metoda statica este per clasa, iar obiectul este o instanta a clasei
//            System.out.println(rand + " is " + app.getEvenOdd_v2(rand));
//            System.out.println(rand + " is " + getEvenOdd_v2(rand));
//            System.out.println(rand + " is " + FourthApplication.getEvenOdd_v2(rand));
//        }

        for (int i = 0; i < 1; i++) {
            int rand = randomGenerator.nextInt(10);
            switch (rand) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                    System.out.println(rand + " isOdd");
                    break;
                case 2:
                case 0:
                case 4:
                case 6:
                case 8:
                    System.out.println(rand + " isEven");
                    break;
                default:
                    System.out.println(rand + " is not allowed");
            }

            if(rand == 1) {
                System.out.println();
            } else if(rand == 2) {
                //..
            }
        }
    }

    /*

     */
    public String getEvenOdd(int number) {
        return ( number % 2 == 0 ? "even" : "odd" );
    }

    public static String getEvenOdd_v2(int number) {
        return ( number % 2 == 0 ? "even" : "odd" );
    }
}
