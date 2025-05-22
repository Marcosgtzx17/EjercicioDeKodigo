import java.util.Scanner;

public class Simulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Barco barco = new Barco(3, 3);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar tripulante");
            System.out.println("2. Buscar por rol");
            System.out.println("3. Mostrar barco");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el rol del tripulante: ");
                    String rol = scanner.nextLine();
                    barco.agregarTripulante(new Tripulante(rol));
                    break;
                case 2:
                    System.out.print("Ingrese el rol a buscar: ");
                    String buscar = scanner.nextLine();
                    barco.buscarPorRol(buscar);
                    break;
                case 3:
                    barco.mostrarEstado();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println(" Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close(); 
    }
}
