package second_task;

import java.util.*;

import static second_task.OptionsAvailable.*;

public class StoreClientsRecord {

    public static void main(String[] args){

        String chooseMessage = "Has escogido la opción ";
        String menuOptions = "a. Añadir nuevo cliente\n"
            + "b. Borrar un cliente\n"
            + "c. Buscar un cliente\n"
            + "d. Mostrar los clientes\n"
            + "e. Salir\n"
            + "Escribe una de las opciones";

        Scanner scanner = new Scanner(System.in);
        int clientFindId;
        int clientDeleteId;
        boolean exit = false;

        while(!exit) {
            String optionTyped;
            System.out.println(menuOptions);
            optionTyped = scanner.next();

            switch(optionTyped){
                case "a":

                    String clientName;
                    int clientID;

                    System.out.println(chooseMessage + optionTyped);

                    System.out.println("Para agregar a un nuevo cliente por favor");

                    System.out.println("Ingrese el nombre completo: ");
                    clientName = scanner.next();

                    if(onlyDigits(clientName)){
                        System.out.println("No es posible usar el valor");
                        break;
                    }

                    System.out.println("Ingrese el número de cédula: ");
                    try{
                        clientID = scanner.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("No es posible usar el valor");
                        break;
                    }

                    optionA(clientName, clientID);

                    break;
                case "b":

                    System.out.println(chooseMessage + optionTyped);

                    System.out.println("Por favor indique la cédula del usuario a eliminar.");
                    try{
                        clientDeleteId = scanner.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("No es posible usar el valor");
                        break;
                    }
                    
                    optionB(clientDeleteId);
                    break;
                case "c":

                    System.out.println(chooseMessage + optionTyped);

                    System.out.println("Por favor indique la cédula del usuario que busca.");
                    try{
                        clientFindId = scanner.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("No es posible usar el valor");
                        break;
                    }
                    
                    optionC(clientFindId);
                    break;
                case "d":

                    System.out.println(chooseMessage + optionTyped);
                    optionD();
                    break;
                case "e":

                    System.out.println("Hasta luego!");
                    exit = true;
                    break;
            }
        }
        scanner.close();
    }

    public static boolean onlyDigits(String str){

        for (int i = 0; i < str.length() - 1; i++) {
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
