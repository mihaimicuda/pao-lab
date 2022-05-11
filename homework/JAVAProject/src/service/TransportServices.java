package service;

import exceptions.InvalidDataException;
import model.Transport;
import repository.TransportRepository;

import java.util.ArrayList;
import java.util.List;

public class TransportServices {

    private TransportRepository transportRepository = new TransportRepository();

    public List<Transport> getAllTransports(){
        List<Transport> transports = new ArrayList<>();
        for(int i = 0; i< transportRepository.getSize(); i++)
            transports.add(transportRepository.get(i));
        return transports;
    }
    public void addNewTransports(Transport transport) throws InvalidDataException{
        if(transport == null) throw new InvalidDataException("The transport doesn't exist!");

        Transport newTransport = new Transport(transport);
        transportRepository.add(newTransport);
    }
    public void addNewTransports(Integer idTransport, String typeTransport, String userClient, Integer idDeleveryCompany, Float weight ) throws InvalidDataException {
        if(typeTransport == null || typeTransport.equals("")) throw new InvalidDataException("Invalid type!");
        if(weight < 0) throw new InvalidDataException("Weight invalid!");

        Transport newTransport = new Transport(idTransport,typeTransport,userClient,idDeleveryCompany,weight);
        transportRepository.add(newTransport);

    }

}
