package service.csv;

import model.Client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientCSVServices implements GenericCSV<Client> {
   public static final ClientCSVServices INSTANCE = new ClientCSVServices();

   private ClientCSVServices(){

   }
   public static ClientCSVServices getInstance(){return INSTANCE;}





    @Override
    public void write(Client client){
       try(FileWriter fileWriter = new FileWriter("files/clients.cvs",true)){
           fileWriter.write(client.getfirstName()+ "," + client.getlastName() + "," + client.getphoneNo() + "," + client.getUserClient() + "," + client.getAddress() + '\n');
           fileWriter.flush();

       }catch (IOException e){
           System.out.println("Error writing to file!");
       }

    }

    @Override
    public List<Client> read(){
        List<Client> clients = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("file/clients.cvs"))) {
            String l;
            while ((l = bufferedReader.readLine()) != null) {
                String[] tokens = l.split(",");
                Client client = new Client(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]), tokens[4]);
                clients.add(client);
            }
        }catch (IOException e){
            System.out.println("Error reading from file!");

        }
        return clients;
    }
}
