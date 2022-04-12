package ro.unibuc;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FileWordCounter {
    public List<String> getSizeOne(String fileName) throws IOException {
        File fisier = new File(fileName); //fisierul din care citim
        BufferedReader fileReader = new BufferedReader(new FileReader(fisier));
        {
            String text;
            List<String> lista = new ArrayList<String>();
            while((text = fileReader.readLine()) != null)
            {
                String[] cuvinte = text.split(" "); //citeste cuvantul pana la spatiu
                for(String cuvant : cuvinte) //un for care parcurge toate cuvintele
                    if(cuvant.length()==1) //daca gaseste un cuvant de lungime 1, este adaugat in lista
                        lista.add(cuvant);
            }
            return lista;
        }
    }

    public List<String> getSizeLessThan3(String fileName) throws IOException {
        File fisier = new File(fileName); //asemanator cu getSizeOne
        BufferedReader fileReader = new BufferedReader(new FileReader(fisier));
        {
            String text;
            List<String> lista = new ArrayList<String>();
            while((text = fileReader.readLine()) != null)
            {
                String[] cuvinte = text.split(" ");
                for(String cuvant : cuvinte)
                    if(cuvant.length()<3)
                        lista.add(cuvant);
            }
            return lista;
        }
    }

    public List<String> countWordAppearances(String fileName, String word) throws IOException {
        File fisier = new File(fileName);
        BufferedReader fileReader = new BufferedReader(new FileReader(fisier));
        {
            String text;
            List<String> lista = new ArrayList<String>();
            while((text = fileReader.readLine()) != null)
            {
                String[] cuvinte = text.split(" ");
                for(String cuvant : cuvinte)
                    if(cuvant.equals(word) || cuvant.equals(word + "!"))
                        lista.add(cuvant);
            }
            return lista;
        }
    }


    public static int getSizeN(String stringSample, int n){
        String[] cuvinte = stringSample.split(" "); //o functie care numara cate cuvinte au lungime mai mare decat n
        int numarCuvinte = 0;
        for (String cuvant : cuvinte)
            if (cuvant.length() > n)
                numarCuvinte++;
        return numarCuvinte;
    }
}
