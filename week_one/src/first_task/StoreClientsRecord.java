package first_task;

import java.util.*;

import static first_task.OptionsAvailable.*;

public class StoreClientsRecord {

    public static void main(String[] args) {

        // Initialize known values
        String[] menuOptions = {
                "a. Añadir nuevo cliente",
                "b. Borrar un cliente",
                "c. Buscar un cliente",
                "d. Mostrar los clientes",
                "e. Salir"
        };
        String[] clientRecord = new String[4];

        menuDisplay(menuOptions);
    }

    public static void menuDisplay(String[] menuOptions){

        Scanner scanner = new Scanner(System.in);
        String optionTyped;
        String chooseMessage = "Has escogido la opción ";

        do {
            Arrays.stream(menuOptions).forEachOrdered(System.out::println);
            System.out.println("Escribe una de las opciones");
            optionTyped = scanner.nextLine();

            switch(optionTyped){
                case "a":
                    System.out.println(chooseMessage + optionTyped);
                    optionA();
                    break;
                case "b":
                    System.out.println(chooseMessage + optionTyped);
                    optionB();
                    break;
                case "c":
                    System.out.println(chooseMessage + optionTyped);
                    optionC();
                    break;
                case "d":
                    System.out.println(chooseMessage + optionTyped);
                    optionD();
                    break;
                case "e":
                    System.out.println("Hasta luego!");
                    break;
                default:
                    break;
            }
        } while(!optionTyped.equals("e"));

        scanner.close();
    }

    public static void addNewUser(String newUser){

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
