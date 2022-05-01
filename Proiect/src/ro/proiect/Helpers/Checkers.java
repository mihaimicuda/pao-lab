package ro.proiect.Helpers;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public final class Checkers {

    public static void IsNull(Object arg, String name) {
        if (arg == null) {
            throw new IllegalArgumentException("Argument null: " + name);
        }
    }

    public static <T> void CheckProperty(T arg, Predicate<T> property, String errorMsg) {
        if (!property.test(arg)) {
            throw new IllegalArgumentException(errorMsg);
        }
    }

    public static <T> void CheckProperty(T arg1, T arg2, BiPredicate<T,T> property, String errorMsg) {
        if (!property.test(arg1, arg2)) {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
