package com.company;

public class Dog implements Sound{
    @Override
    public void makeSound() {
        System.out.println("Bark, bark! Woof, woof!");
    }
}
