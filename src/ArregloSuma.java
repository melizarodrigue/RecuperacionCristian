import java.util.ArrayList;
import java.util.Scanner;

public class ArregloSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arreglo1 = new ArrayList<>();
        ArrayList<Integer> arreglo2 = new ArrayList<>();
        ArrayList<Integer> resultado = new ArrayList<>();

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamaño = scanner.nextInt();
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el valor para el arreglo 1 en la posición " + i + ": ");
            arreglo1.add(scanner.nextInt());
        }
        
        
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el valor para el arreglo 2 en la posición " + i + ": ");
            arreglo2.add(scanner.nextInt());
        }

        
        for (int i = 0; i < tamaño; i++) {
            resultado.add(arreglo1.get(i) + arreglo2.get(i));
        }

        System.out.println("\nContenido del arreglo 1:");
        mostrarArreglo(arreglo1);

        System.out.println("\nContenido del arreglo 2:");
        mostrarArreglo(arreglo2);

        System.out.println("\nContenido del arreglo resultante:");
        mostrarArreglo(resultado);

        scanner.close();
    }
    
    

    public static void mostrarArreglo(ArrayList<Integer> arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}