package ro.unibuc.lab7.diplome;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DiplomaCsvService implements DiplomaService {

    private final File diplomeFile;

    public DiplomaCsvService() {
        this.diplomeFile = new File("src/main/resources/diplome.csv");
        if(!diplomeFile.exists()) {
            try {
                diplomeFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void save(Diploma diploma) {
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(diplomeFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(formatForCsv(diploma));
            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (Exception e) {

        } finally {
            if(fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                }
            }

            if(bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                }
            }
        }
    }

    @Override
    public Diploma getByAbsolvent(String absolvent) {
        try {
            FileReader fileReader = new FileReader(diplomeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            //lines -> Diploma -> diploma indeplineste conditia?(absolvent) -> getFirst
            Optional<Diploma> diplomaOptional = bufferedReader.lines()
                    .map(line -> getDiplomaFromCsvLine(line))
                    .filter(diploma -> diploma.getAbsolvent().equals(absolvent))
                    .findFirst();

            if(diplomaOptional.isPresent()) {
                return diplomaOptional.get();
            }
        } catch (Exception e) {

        }

        return null;
    }

    @Override
    public List<Diploma> getAll() {
        try {
            FileReader fileReader = new FileReader(diplomeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<Diploma> diplome = bufferedReader.lines()
                    .map(line -> getDiplomaFromCsvLine(line))
                    .collect(Collectors.toList());

            return diplome;
        } catch (Exception e) {

        }

        return Collections.emptyList();
    }

    @Override
    public List<Diploma> findDiplomasBetweenYears(int start, int end) {
        try {
            FileReader fileReader = new FileReader(diplomeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<Diploma> diplome = bufferedReader.lines()
                    .map(line -> getDiplomaFromCsvLine(line))
                    .filter(diploma -> diploma.getAn() >= start && diploma.getAn() <= end)
                    .collect(Collectors.toList());

            return diplome;
        } catch (Exception e) {

        }

        return Collections.emptyList();
    }

    @Override
    public List<Diploma> findAllByPerfectScore() {
        try {
            FileReader fileReader = new FileReader(diplomeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<Diploma> diplome = bufferedReader.lines()
                    .map(line -> getDiplomaFromCsvLine(line))
                    .filter(diploma -> diploma.getMedie() == 10.0)
                    .distinct()
                    .collect(Collectors.toList());

            return diplome;
        } catch (Exception e) {

        }

        return Collections.emptyList();
    }

    private Diploma getDiplomaFromCsvLine(String line) {
        String[] values = line.split(",");
        Diploma diploma = new Diploma(
                values[1],
                values[0],
                Integer.parseInt(values[2]),
                values[3],
                values[4],
                Double.parseDouble(values[5]));

        return diploma;
    }

    private String formatForCsv(Diploma diploma) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(diploma.getAbsolvent());
        stringBuilder.append(",");
        stringBuilder.append(diploma.getSerie());
        stringBuilder.append(",");
        stringBuilder.append(diploma.getAn());
        stringBuilder.append(",");
        stringBuilder.append(diploma.getFacultate());
        stringBuilder.append(",");
        stringBuilder.append(diploma.getSpecializare());
        stringBuilder.append(",");
        stringBuilder.append(diploma.getMedie());

        return stringBuilder.toString();
    }
}
