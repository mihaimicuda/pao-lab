package ro.unibuc.lab6.streams;

import java.io.*;

/**
 *
 * If exception extends RuntimeException -> unchecked
 * If exception extends Exception -> checked
 *
 * unchecked -> does not need immediate handling
 * checked -> needs to be handled immediately
 *
 * exception handling:
 * 1. try-catch-finally block
 * 2. throws in method signature
 * 3. try-with-resources
 */
public class ExceptionExamples {
    public static void main(String[] args) {
        ExceptionExamples exceptionExamples = new ExceptionExamples();

        exceptionExamples.printFileContent("src/main/resources/sample.txt");
        try {
            exceptionExamples.printFileContentDifferently("src/main/resources/sample.txt");
        } catch (FileNotFoundException e) {

        }

        exceptionExamples.printFileContentWithTryResources("src/main/resources/sample.txt");

        try {
//            exceptionExamples.printFileContent("inexistent path");
            exceptionExamples.showExceptions(exceptionExamples);
        } catch (CustomUncheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    void showExceptions(ExceptionExamples exceptionExamples) {
        try {
            exceptionExamples.printFileContent("blabla");
        } catch (CustomUncheckedException e) {
            throw e;
        }

//        exceptionExamples.printFileContentDifferently("blalba");
    }

    void printFileContent(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            //something can happen in here, which is why we close the resource in finally bloc
            //            throw new RuntimeException();
            //            reader.close();
        } catch (FileNotFoundException e) {
            throw new CustomUncheckedException(e);
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {

                }
            }
        }
    }

    void printFileContentDifferently(String filePath) throws FileNotFoundException {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
    }

    void printFileContentWithTryResources(String filePath) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.lines().forEach(line -> System.out.println(line));
        } catch (IOException e) {

        }

    }
}
