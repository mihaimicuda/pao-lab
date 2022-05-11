package service;

import exceptions.InvalidDataException;
import model.Client;
import repository.ClientRepository;
import service.csv.ClientCSVServices;

import java.util.ArrayList;
import java.util.List;

public class ClientServices {
    private ClientRepository clientRepository = new ClientRepository();

    public List<Client> getAllClients(){
        List<Client> clients = new ArrayList<>();
        for(int i = 0; i <clientRepository.getSize(); i++)
            clients.add(clientRepository.get(i));
        return clients;
    }

    public void addNewClients(Client client) throws InvalidDataException{
        if(client == null)
            throw new InvalidDataException("The client doesn't exists");
        Client newClient = new Client(client);
        clientRepository.add(newClient);
    }
    public void addNewClients(String lastName, String firstName, String phoneNo, Integer userClient, String adresa)
        throws InvalidDataException{
        if(userClient == null)
            throw new InvalidDataException("ID invalid");

        Client newCl = new Client(lastName,firstName,phoneNo,userClient,adresa);
        clientRepository.add(newCl);
    }
    public void listedFromCSV(){
        ClientCSVServices clientCSVServices = ClientCSVServices.getInstance();
        List<Client> clients = new ArrayList<>(clientCSVServices.read());
        for(Client client: clients){
            clientRepository.add(client);
        }
    }
    public void listedInCSV(){
        ClientCSVServices clientCSVServices = ClientCSVServices.getInstance();
        ClientServices clientServices = new ClientServices();
        List<Client> clients = new ArrayList<>(clientServices.getAllClients());
        for( Client client: clients)
        {
            clientCSVServices.write(client);
        }
    }
}
