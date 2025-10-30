public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        int[] numeros = new int[]{4, 3, 9, 7, 8};

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            // Opción 4: salir
            if (option == 4) {
                System.out.println("Adiós");
                break; // termina el while y sale del programa
            }

            view.showOrder();
            int orden = view.inputOption(2);
            boolean ascendente = (orden == 1); // true = ascendente

            view.showPasosMenu();
            int pasos = view.inputOption(2);
            boolean mostrarPasos = (pasos == 1);

            switch (option) {
                case 1:
                    System.out.println("\nMétodo: Selección");
                    SortSelection seleccion = new SortSelection();
                    int[] numerosSeleccion = numeros.clone(); // clonar para mostrar pasos correctamente
                    seleccion.sort(numerosSeleccion, ascendente, mostrarPasos);
                    break;
                case 2:
                    System.out.println("\nMétodo: Inserción");
                    SortInsertion insercion = new SortInsertion();
                    int[] numerosInsercion = numeros.clone();
                    insercion.sort(numerosInsercion, ascendente, mostrarPasos);
                    break;
                case 3:
                    System.out.println("\nMétodo: Burbuja");
                    SortBubble burbuja = new SortBubble();
                    int[] numerosBurbuja = numeros.clone();
                    burbuja.sort(numerosBurbuja, ascendente, mostrarPasos);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
