import java.util.Scanner;

public class View {
    private final Scanner scanner;

    public View() {
        System.out.println("=== Métodos de Ordenamiento ===");
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\n--- Menú de Métodos ---");
        System.out.println("1. Selección");
        System.out.println("2. Inserción");
        System.out.println("3. Burbuja");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void showOrder() {
        System.out.println("\n--- Tipo de Orden ---");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        System.out.print("Seleccione: ");
    }

    public void showPasosMenu() {
        System.out.println("\n--- Mostrar Pasos ---");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Seleccione: ");
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
