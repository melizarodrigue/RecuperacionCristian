import java.util.ArrayList;
import java.util.Scanner;

public class RegistroPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> documentos = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        ArrayList<String> profesiones = new ArrayList<>();

        int mayoresEdad = 0;
        int menoresEdad = 0;

        System.out.println("Ingrese la informacion de las personas (Escriba 'fin' para terminar)");

        while (true) {
            System.out.println("\nPersona " + (nombres.size() + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Documento: ");
            String documento = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Profesión: ");
            String profesion = scanner.nextLine();

            nombres.add(nombre);
            documentos.add(documento);
            edades.add(edad);
            profesiones.add(profesion);

            if (edad >= 18) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
        }

        int totalPersonas = nombres.size();
        System.out.println("\n----- Informacion -----");
        System.out.println("Total personas registradas: " + totalPersonas);
        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);

        scanner.close();
    }
}