package service.csv;

import java.io.FileWriter;
import java.io.IOException;

public class AuditServices {

    public void write(String ac, String date){
        try(FileWriter fileWriter = new FileWriter("files/audit.csv", true)){
            fileWriter.write(ac + ","+ date +  '\n');
            fileWriter.flush();
        }catch (IOException ex){
            System.out.println("Error writing to file!");
        }
    }
}
