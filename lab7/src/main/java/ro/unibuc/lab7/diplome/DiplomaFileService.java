package ro.unibuc.lab7.diplome;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DiplomaFileService implements DiplomaService {

    private final File diplomeFile;

    public DiplomaFileService() {
        this.diplomeFile = new File("src/main/resources/diplome.dat");
        if(!diplomeFile.exists()) {
            try {
                diplomeFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Diploma> findAllByPerfectScore() {
        return null;
    }

    @Override
    public List<Diploma> getAll() {
        return null;
    }

    @Override
    public List<Diploma> findDiplomasBetweenYears(int start, int end) {
        return null;
    }

    @Override
    public void save(Diploma diploma) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(diplomeFile, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(diploma);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Diploma getByAbsolvent(String absolvent) {

        List<Diploma> diplome = new ArrayList<>();

        try(FileInputStream fileInputStream = new FileInputStream(diplomeFile)) {
            try(ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                try {

                    while(true) {
                        try {
                            Object object = objectInputStream.readObject();
                            Diploma retrieved = (Diploma)object;
                            System.out.println(retrieved);
                        } catch(EOFException e) {

                        }

                    }


                } catch (ClassNotFoundException e) {

                }
            }
        } catch (IOException e) {

        }

        List<Diploma> diplomeAbsolvent = diplome.stream()
                .filter(diploma -> diploma.getAbsolvent().equals(absolvent))
                .collect(Collectors.toList());

        if(diplomeAbsolvent.size() > 1) {
            throw new MultipleDiplomaException(absolvent);
        } else if(diplomeAbsolvent.size() == 0) {
            return null;
        }

        return diplomeAbsolvent.get(0);
    }

    @Override
    public void delete(Diploma diploma) {

    }

    @Override
    public List<Diploma> findByCustomFilter(Predicate<Diploma> filter) {
        return null;
    }
}
