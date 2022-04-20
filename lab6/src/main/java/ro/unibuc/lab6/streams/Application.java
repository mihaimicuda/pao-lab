package ro.unibuc.lab6.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Interfete functionale introduse in java 8:
 * Consumer
 * Function
 * Predicate
 * Supplier
 */
public class Application {

    public static void main(String[] args) {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("My str " + s);
            }
        };

        Consumer<String> anotherConsumer = (s) -> {
            System.out.println("My str " + s);
        };

        consumer.accept("hi");
        anotherConsumer.accept("hi");

        Function<Integer, String> myFunction = i -> {return String.valueOf(i);};
        System.out.println("myFunction: " + myFunction.apply(3));

        Predicate<Integer> myPredicate = myInt -> {return myInt %2 == 0;};
        System.out.println("myPredicate " + myPredicate.test(3));

        Supplier<Integer> mySupplier = () -> { return 3;};
        System.out.println("mySupplier " + mySupplier.get());



        Collections.sort(Arrays.asList(1, 5, 2, 4), (o1, o2) -> o2 - o1);

        Nop<String> nopSupplier = str -> { return str;};
    }

}
