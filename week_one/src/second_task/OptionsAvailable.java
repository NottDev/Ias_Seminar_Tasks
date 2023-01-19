package second_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OptionsAvailable {

    public static List<Client> clientsRecord = new ArrayList<>();

    public static void optionA(String clientName, int clientID){

        // Add a new client
        Client newUser = new Client(clientName, clientID);

        clientsRecord.stream()
                .forEach(client -> {
                if(client.getId() == clientID){
                    System.out.println("La cédula ya ha sido asociada a un usuario en el sistema.");
                    return;
                };
            });

        clientsRecord.add(newUser);
    }

    public static void optionB(int idToRemove){

        // Remove an existing client
        try {
            clientsRecord.removeIf(obj -> obj.getId() == idToRemove);
        } catch(NullPointerException | UnsupportedOperationException e){
            System.out.println("Por favor ingrese una cédula valida.");
            return;
        }

        System.out.println("El usuario ha sido eliminado satisfactoriamente.");
    }

    public static void optionC(int clientID){

        // Get a specific client
        clientsRecord.forEach(client ->{
            if(client.getId() == clientID){
                String name = client.getName();
                int id = client.getId();
                int index = clientsRecord.indexOf(client) + 1;

                System.out.println("Cliente número " + (index)
                    + ": El cliente se llama " + name
                    + " y su cédula es " + id + "."
                    );
            }
        });
    }

    public static void optionD(){

        // Get all the clients
        if(!clientsRecord.isEmpty()) {

            clientsRecord.stream()
                .sorted(Comparator.comparing(Client::getName))
                .collect(Collectors.toList())
                .forEach(client ->{
                String name = client.getName();
                int id = client.getId();
                int index = clientsRecord.indexOf(client) + 1;
    
                System.out.println("Cliente número " + (index)
                    + ": El cliente se llama " + name
                    + " y su cédula es " + id + "."
                    );
            });
        } 
        else {
            System.out.println("No se han encontrado clientes dentro del sistema.");
        }
    }
}
