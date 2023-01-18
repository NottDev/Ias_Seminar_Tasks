package first_task;

import java.util.Scanner;
import java.util.InputMismatchException;

import static first_task.StoreClientsRecord.onlyDigits;

public class OptionsAvailable {

    public static String[] clientsRecord = new String[4];
    public static void optionA(){

        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        String clientName;
        int clientID;

        System.out.println("\nPara agregar a un nuevo cliente por favor:");

        System.out.print("Ingrese el nombre completo: ");
        clientName = scanner.nextLine();

        if(onlyDigits(clientName)){
            System.out.println("No es posible usar el valor");
            return;
        }

        System.out.print("\nIngrese el número de cédula: ");
        try{
            clientID = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("No es posible usar el valor");
            return;
        }

        scanner.close();

        String newUser = "Nombre: " + clientName + "\nCédula: " + clientID;


        if (clientsRecord.length <= 10){
            for (int i = 0; i < 10; i++) {
                if (i < 4) {
                    if (clientsRecord[i] != null) {
                        clientsRecord[i] = newUser;
                    }
                }
            }
        }

        System.out.println("Debe borrar un cliente antes de poder ingresar uno nuevo");
    }

    public static void optionB(){

    }

    public static void optionC(){

    }

    public static void optionD(){

    }
}
