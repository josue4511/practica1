public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        int[] numero = new int[] { 4, 3, 9, 7, 8 };

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            view.showOrder();
            int orden = view.inputOption(2);
            boolean orderOpt = (orden == 1); // true = ascendente, false = descendente

            view.showPasosMenu(null, false);
            int pasos = view.inputOption(2);
            boolean showSteps = (pasos == 1);

            switch (option) {
                case 1:
                    System.out.println("Método Selección");
                    SortSelection selection = new SortSelection();
                    selection.sort(numero, orderOpt, showSteps);
                    break;
                case 2:
                    System.out.println("Método Inserción");
                    SortInsertion sortInsertion = new SortInsertion();
                    sortInsertion.sort(numero, orderOpt, showSteps);
                    break;
                case 3:
                    System.out.println("Método Burbuja");
                    SortBubble sortBubble = new SortBubble();
                    sortBubble.sort(numero, orderOpt, showSteps);
                    break;
                case 4:
                    System.out.println("Adiós");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
