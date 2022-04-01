package ro.unibuc.lab6.streams;

@FunctionalInterface
public interface Nop<T> {

    T doNothing(T something);

}
