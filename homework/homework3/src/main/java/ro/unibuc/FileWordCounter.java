package ro.unibuc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO:
 * scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
 * Lungimea n trebuie introdusa de la tastatura.
 * <p>
 * In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    public List<String> getSizeGreaterThanN(String fileName, int size) {
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            try {
                words.addAll(Arrays.asList(br.readLine().chars().mapToObj(i -> (char) i).filter(c -> c == ' ' || c == '’' || Character.isAlphabetic(c)).map(c -> c.toString()).collect(Collectors.joining()).split(" ")));
            } catch (EOFException | NullPointerException e) {
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> filteredWords = words.stream().filter(x -> x.length() > size).collect(Collectors.toList());
        return filteredWords;
    }

    public List<String> getSizeLessThanN(String fileName, int size) {
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            try {
                words.addAll(Arrays.asList(br.readLine().chars().mapToObj(i -> (char) i).filter(c -> c == ' ' || c == '’' || Character.isAlphabetic(c)).map(c -> c.toString()).collect(Collectors.joining()).split(" ")));
            } catch (EOFException | NullPointerException e) {
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> filteredWords = words.stream().filter(x -> x.length() < size).collect(Collectors.toList());
        return filteredWords;
    }

    public List<String> getSizeOne(String fileName) {
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            try {
                words.addAll(Arrays.asList(br.readLine().chars().mapToObj(i -> (char) i).filter(c -> c == ' ' || c == '’' || Character.isAlphabetic(c)).map(c -> c.toString()).collect(Collectors.joining()).split(" ")));
            } catch (EOFException | NullPointerException e) {
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> filteredWords = words.stream().filter(x -> x.length() == 1).collect(Collectors.toList());
        return filteredWords;
    }

    public List<String> getSizeLessThan3(String fileName) {
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            try {
                words.addAll(Arrays.asList(br.readLine().chars().mapToObj(i -> (char) i).filter(c -> c == ' ' || c == '’' || Character.isAlphabetic(c)).map(c -> c.toString()).collect(Collectors.joining()).split(" ")));
            } catch (EOFException | NullPointerException e) {
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> filteredWords = words.stream().filter(x -> x.length() < 3).collect(Collectors.toList());
        return filteredWords;
    }

    public List<String> countWordAppearances(String fileName, String word) {
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            try {
                words.addAll(Arrays.asList(br.readLine().chars().mapToObj(i -> (char) i).filter(c -> c == ' ' || c == '’' || Character.isAlphabetic(c)).map(c -> c.toString()).collect(Collectors.joining()).split(" ")));
            } catch (EOFException | NullPointerException e) {
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> filteredWords = words.stream().filter(x -> x.equals(word)).collect(Collectors.toList());
        return filteredWords;
    }
}
