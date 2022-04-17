package ro.unibuc.lab7.diplome;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
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

    /**
     * exceptii:
     *  - checked: extind Exception; necesita try-catch-finally sau throws
     *  - uncheked: extind RuntimeException; nu necesita handling
     *
     *  best practice: wrap checked exceptions inside an unchecked exceptions
     *
     *  try {
     *      ...
     *  } catch(IOException e) {
     *      throw new RuntimeException(e);
     *  }
     */
    @Override
    public void save(Diploma diploma) {
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(diplomeFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            //TODO: check if diploma already exists
            //it already exists if absolvent + an + serie match
//            List<Diploma> allDiplomas = getAll().stream()
//                    .filter(storedDiploma -> storedDiploma.getAn() == diploma.getAn() &&
//                                            storedDiploma.getSerie().equals(diploma.getSerie()) &&
//                                            storedDiploma.getAbsolvent().equals(diploma.getAbsolvent())
//                            )
//                    .collect(Collectors.toList());
//
//            if(allDiplomas.size() == 0) {
//                bufferedWriter.write(formatForCsv(diploma));
//                bufferedWriter.write("\n");
//            }

            boolean diplomaAlreadyExists = getAll().stream()
                    .anyMatch(storedDiploma -> storedDiploma.getAn() == diploma.getAn() &&
                            storedDiploma.getSerie().equals(diploma.getSerie()) &&
                            storedDiploma.getAbsolvent().equals(diploma.getAbsolvent())
                    );

            if(!diplomaAlreadyExists) {
                bufferedWriter.write(formatForCsv(diploma));
                bufferedWriter.write("\n");
            }

            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
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
        Optional<Diploma> diplomaOptional = getAll().stream()
                .filter(diploma -> diploma.getAbsolvent().equals(absolvent))
                .findFirst();

        if(diplomaOptional.isPresent()) {
            return diplomaOptional.get();
        }

        return null;

//        try {
//            FileReader fileReader = new FileReader(diplomeFile);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//
//            //lines -> Diploma -> diploma indeplineste conditia?(absolvent) -> getFirst
//            Optional<Diploma> diplomaOptional = bufferedReader.lines()
//                    .map(line -> getDiplomaFromCsvLine(line))
//                    .filter(diploma -> diploma.getAbsolvent().equals(absolvent))
//                    .findFirst();
//
//            if(diplomaOptional.isPresent()) {
//                return diplomaOptional.get();
//            }
//        } catch (Exception e) {
//
//        }
//
//        return null;
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

        return getAll().stream()
                .filter(diploma -> diploma.getAn() >= start && diploma.getAn() <= end)
                .collect(Collectors.toList());

//        try {
//            FileReader fileReader = new FileReader(diplomeFile);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            List<Diploma> diplome = bufferedReader.lines()
//                    .map(line -> getDiplomaFromCsvLine(line))
//                    .filter(diploma -> diploma.getAn() >= start && diploma.getAn() <= end)
//                    .collect(Collectors.toList());
//
//            return diplome;
//        } catch (Exception e) {
//
//        }

//        return Collections.emptyList();
    }

    @Override
    public List<Diploma> findAllByPerfectScore() {
        return getAll().stream()
                .filter(diploma -> diploma.getMedie() == 10.0)
                .collect(Collectors.toList());


//        try {
//            FileReader fileReader = new FileReader(diplomeFile);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            List<Diploma> diplome = bufferedReader.lines()
//                    .map(line -> getDiplomaFromCsvLine(line))
//                    .filter(diploma -> diploma.getMedie() == 10.0)
//                    .distinct()
//                    .collect(Collectors.toList());
//
//            return diplome;
//        } catch (Exception e) {
//
//        }
//
//        return Collections.emptyList();
    }

    /*
    1. parcurgem fiecare linie din fisier
    2. mapam la obiect de tip diploma
    3. verificam daca este obiectul nostru
    4. daca este, atunci il stergem(filtrare)
    5. outputul este o lista de linii care vor ramane
    6. scriem outputul inapoi in fisier
     */
    @Override
    public void delete(Diploma diplomaToDelete) {
        List<Diploma> remainingDiplomas = getAll().stream()
                .filter(storedDiploma -> storedDiploma.getAn() != diplomaToDelete.getAn() ||
                        !storedDiploma.getSerie().equals(diplomaToDelete.getSerie()) ||
                        !storedDiploma.getAbsolvent().equals(diplomaToDelete.getAbsolvent()))
                .collect(Collectors.toList());


        try(FileWriter fileWriter = new FileWriter(diplomeFile, false)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(Diploma diploma : remainingDiplomas) {
                bufferedWriter.write(formatForCsv(diploma));
                bufferedWriter.write("\n");
            }

            bufferedWriter.close();
        } catch (IOException e) {

        }
    }

    @Override
    public List<Diploma> findByCustomFilter(Predicate<Diploma> filter) {
        return getAll().stream()
                .filter(filter)
                .collect(Collectors.toList());
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
