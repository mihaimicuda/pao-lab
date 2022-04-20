package com.company;

public class Main {

    public static void main(String[] args) {
        //FACTORY
        SoundFactory soundFactory = new SoundFactory();
        Sound sound1 = soundFactory.createSound("DOG");
        Sound sound2 = soundFactory.createSound("MOUSE");
        //Sound sound3 = soundFactory.createSound("HORSE");
        sound1.makeSound();
        sound2.makeSound();
        //sound3.makeSound();

        //ADAPTER
        Pigeon pigeon = new Pigeon();
        PlasticDuck plasticDuck = new PlasticDuck();
        ToyDuck birdAdapter = new BirdAdapter(pigeon);
        pigeon.makeSound();
        plasticDuck.squeak();
        birdAdapter.squeak();
    }
}
