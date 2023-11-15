import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nomina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Double> descuentosPorEstrato = new HashMap<>();
        Map<String, Double> descuentosEmpleados = new HashMap<>();

        
        descuentosPorEstrato.put(1, 0.02);
        descuentosPorEstrato.put(2, 0.02);
        descuentosPorEstrato.put(3, 0.04);
        descuentosPorEstrato.put(4, 0.04);
        descuentosPorEstrato.put(5, 0.08);
        descuentosPorEstrato.put(6, 0.10);

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine(); 
        
        

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombreEmpleado = scanner.nextLine();

            System.out.print("Ingrese el estrato social del empleado " + nombreEmpleado + ": ");
            int estrato = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Ingrese el sueldo actual del empleado " + nombreEmpleado + ": ");
            double sueldoActual = scanner.nextDouble();
            scanner.nextLine(); 

            
            double porcentajeDescuento = descuentosPorEstrato.getOrDefault(estrato, 0.0);
            double descuento = sueldoActual * porcentajeDescuento;

            descuentosEmpleados.put(nombreEmpleado, descuento);
        }

        
        System.out.println("\nDescuentos realizados:");
        for (Map.Entry<String, Double> entry : descuentosEmpleados.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + ", Descuento: " + entry.getValue());
        }

        scanner.close();
    }
}