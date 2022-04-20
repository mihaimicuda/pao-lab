package com.company;

public class SoundFactory {
    public Sound createSound(String animal) {
        if (animal == null || animal.isEmpty())
            return null;
        switch (animal) {
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
            case "MOUSE":
                return new Mouse();
            default:
                throw new IllegalArgumentException("Unknown animal " + animal);
        }
    }
}
