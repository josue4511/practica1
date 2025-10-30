public class SortSelection {

    public void sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc) sortAscendente(numeros, pasos);
        else sortDescendente(numeros, pasos);
    }

    public void sortAscendente(int[] numeros, boolean pasos) {
        int comparaciones = 0, cambios = 0;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                comparaciones++;
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                int aux = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = aux;
                cambios++;
                if (pasos) {
                    System.out.print("Paso " + cambios + " -> ");
                    printArray(numeros);
                }
            }
        }
        System.out.println("Comparaciones: " + comparaciones + ", Cambios: " + cambios);
    }

    public void sortDescendente(int[] numeros, boolean pasos) {
        int comparaciones = 0, cambios = 0;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMayor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                comparaciones++;
                if (numeros[j] > numeros[indiceMayor]) {
                    indiceMayor = j;
                }
            }
            if (i != indiceMayor) {
                int aux = numeros[i];
                numeros[i] = numeros[indiceMayor];
                numeros[indiceMayor] = aux;
                cambios++;
                if (pasos) {
                    System.out.print("Paso " + cambios + " -> ");
                    printArray(numeros);
                }
            }
        }
        System.out.println("Comparaciones: " + comparaciones + ", Cambios: " + cambios);
    }

    public void printArray(int[] numeros) {
        for (int num : numeros) System.out.print(num + " ");
        System.out.println();
    }
}
