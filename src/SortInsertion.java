public class SortInsertion {

    public void sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc) ordenarAscendente(numeros, pasos);
        else ordenarDescendente(numeros, pasos);
    }

    public void ordenarAscendente(int[] arreglo, boolean pasos) {
        int comparaciones = 0, cambios = 0;
        System.out.print("Arreglo original -> ");
        printArray(arreglo);

        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
                comparaciones++;
                cambios++;
                if (pasos) {
                    System.out.print("Paso " + cambios + " -> ");
                    printArray(arreglo);
                }
            }
            arreglo[j + 1] = aux;
        }

        System.out.println("Comparaciones: " + comparaciones + ", Cambios: " + cambios);
    }

    public void ordenarDescendente(int[] arreglo, boolean pasos) {
        int comparaciones = 0, cambios = 0;
        System.out.print("Arreglo original -> ");
        printArray(arreglo);

        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] < aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
                comparaciones++;
                cambios++;
                if (pasos) {
                    System.out.print("Paso " + cambios + " -> ");
                    printArray(arreglo);
                }
            }
            arreglo[j + 1] = aux;
        }

        System.out.println("Comparaciones: " + comparaciones + ", Cambios: " + cambios);
    }

    public void printArray(int[] arreglo) {
        for (int num : arreglo) System.out.print(num + " ");
        System.out.println();
    }
}
