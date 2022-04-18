package ro.unibuc.pao.homework2.factory;

public class AnimalFactory {

    public Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog"))
            return new Dog();
        if (type.equalsIgnoreCase("cat"))
            return new Cat();
        if (type.equalsIgnoreCase("chicken"))
            return new Chicken();
        return null;
    }

}
