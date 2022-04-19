package ro.unibuc.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TODO: diferente dintre array list si linkedList ?
        ArrayList<String> strings = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        //int [] -> 0x1 0x2 0x3 0x4

        List<Integer> intList = new ArrayList<>();

        doSomething(intList);

        List<Integer> linkedList = new LinkedList<>();

        doSomething(linkedList);

        doSomething(new ArrayList<>(Arrays.asList(1, 2, 3)));
        doSomething(new LinkedList<>());

        Set<Integer> uniques = new HashSet<>();
    }

    public static void doSomething(List<Integer> numbers) {

    }
}
