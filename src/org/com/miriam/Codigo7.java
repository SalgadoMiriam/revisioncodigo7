package org.com.miriam;
import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

    public static void main(String[] args) {
        // El codigo entrega la capital de un país ingresado por el usuario, de no existir el país, se pregunta cual es la capital y se agrega al HashMap
    	
    	
        // Creación de clase Scanner para leer la entrada de datos de consola
        Scanner scanner = new Scanner(System.in);
        
        // Creación HashMap para guardar capitales de pais en pares
        HashMap<String, String> capitales = new HashMap<>();
        
        // Se agrega capital y país en pares
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "México DF");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador"); // Add the missing capital
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");
        
       // Cambio de nombre de variable
        String pais = "";
        
        do {
            // Mostrar al usuario el ingreso del pais
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = scanner.nextLine();
            
            //agregar ignorar mayusculas
            if (!pais.equalsIgnoreCase("salir")) {
                if (capitales.containsKey(pais)) {
                    // Si el páis contiene una capital en HashMap, imprime la capital
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    // Si el pais no existe en HashMap, preguntar al usuario 
                    System.out.println("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
                    String capital = scanner.nextLine();
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!pais.equalsIgnoreCase("salir"));
        
        scanner.close();
    }
}
