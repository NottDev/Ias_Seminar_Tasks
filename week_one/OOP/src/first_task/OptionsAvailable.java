package first_task;

import java.util.Arrays;

public class OptionsAvailable {

    public static int registeredClients = 1;
    public static Client[] clientsRecord = new Client[4];

    public static void optionA(String clientName, int clientID){

        Client newUser = new Client(clientName, clientID);

        if(registeredClients < 5){
            for(int i = 0; i < clientsRecord.length; i++){
                if(clientsRecord[i] == null){
                    clientsRecord[i] = newUser;
                    registeredClients++;
                    break;
                }
            }
        }
        else if(registeredClients <= 10){

            Client[] newClientsRecord = Arrays.copyOf(clientsRecord, registeredClients);
            int index = registeredClients - 1;

            newClientsRecord[index] = newUser;
            registeredClients++;

            clientsRecord = newClientsRecord;
        }
        else {
            System.out.println("Debe borrar un cliente antes de poder ingresar uno nuevo");
        }

    }

    public static void optionB(int indexToRemove){

        if (indexToRemove >= registeredClients){
            System.out.println("No se ha encontrado el indice indicado.");
            return;
        }

        int i;
        for (i = (indexToRemove - 1); i < (clientsRecord.length - 1); i++){
            clientsRecord[i] = clientsRecord[i + 1];
        }

        if(i < 4){
            clientsRecord = Arrays.copyOf(clientsRecord, 4);
        } 
        else{
            clientsRecord = Arrays.copyOf(clientsRecord, i);
        }

        registeredClients--;
    }

    public static void optionC(int index){

        if(index <= 0 || index >= registeredClients){
            System.out.println("Por favor seleccione un index valido.");
            return;
        }

        String name = clientsRecord[index - 1].getName();
        int id = clientsRecord[index - 1].getId();

        System.out.println("Cliente número " + (index)
                    + ": El cliente se llama " + name
                    + " y su cédula es " + id + "."
                    );
    }

    public static void optionD(){

        if(registeredClients > 1) {

            for (int i = 0; i < registeredClients - 1; i++) {
    
                String name = clientsRecord[i].getName();
                int id = clientsRecord[i].getId();
    
                System.out.println("Cliente número " + (i + 1)
                    + ": El cliente se llama " + name
                    + " y su cédula es " + id + "."
                    );
            }
        } 
        else {
            System.out.println("No se han encontrado clientes dentro del sistema.");
        }
    }
}
