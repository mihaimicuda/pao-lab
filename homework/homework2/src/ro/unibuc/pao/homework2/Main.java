package ro.unibuc.pao.homework2;

import ro.unibuc.pao.homework2.adapter.NotepadReader;
import ro.unibuc.pao.homework2.factory.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal animal;

        NotepadReader notepadreader = new NotepadReader();

        Scanner reader = new Scanner(System.in);
        Character opt = 'e';
        while (!opt.equals('q')) {
            System.out.println("Alegeti pattern-ul");
            System.out.println("1.Factory");
            System.out.println("2.Adapter/Bridge");
            System.out.println("q.Iesire");
            opt = reader.next().charAt(0);
            if (opt.equals('1'))
                while (!opt.equals('b')) {
                    System.out.println("Alegeti tipul animalului");
                    System.out.println("1.Caine");
                    System.out.println("2.Pisica");
                    System.out.println("3.Pui");
                    System.out.println("b.Inapoi");
                    String[] types = {"dog", "cat", "chicken"};
                    opt = reader.next().charAt(0);
                    if (opt > '0' && opt < '4') {
                        animal = factory.getAnimal(types[opt - '0' - 1]);
                        animal.speak();

                    } else if (!opt.equals('b')) {
                        System.out.println("Invalid choice");
                    }
                }
            else if (opt.equals('2'))
                while (!opt.equals('b')) {
                    System.out.println("Alegeti tipul fisierului");
                    System.out.println("1.Binar");
                    System.out.println("2.Docx");
                    System.out.println("3.Ritch Text Document");
                    System.out.println("b.Inapoi");
                    String[] types = {"bin", "docx", "RTF"};
                    opt = reader.next().charAt(0);

                    if (opt > '0' && opt < '4') {
                        notepadreader.read(types[opt - '0' - 1], System.getProperty("user.dir"));
                    } else if (!opt.equals('b')) {
                        System.out.println("Invalid choice");
                    }

                }
        }
    }
}
