import java.util.Scanner;

public class View {
    private final Scanner scanner;

    
    public View() {
        System.out.println("Métodos de Ordenamiento");
        scanner = new Scanner(System.in);
    }

    
    public void showMenu() {
        System.out.println("\n-- Menú Métodos --");
        System.out.println("1.- Selección");
        System.out.println("2.- Inserción");
        System.out.println("3.- Burbuja");
        System.out.println("4.- Salir");
        System.out.print("Seleccione la opción: ");
    }

    
    public int inputOption(int max) {
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 1 && option <= max) {
                    break;
                } else {
                    System.out.print("Opción inválida. Intente nuevamente: ");
                }
            } else {
                System.out.print("Entrada no válida. Ingrese un número: ");
                scanner.next(); 
            }
        }
        return option;
    }
}
