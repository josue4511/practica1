public class SortBubble {

    public int[] sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc) {
            return sortAscendente(numeros, pasos);
        } else {
            return sortDescendente(numeros, pasos);
        }
    }

    private int[] sortAscendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        int comparaciones = 0;
        int cambios = 0;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 0; i < n - 1; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                if (numeros[j] > numeros[j + 1]) {
                    if (pasos) System.out.println("Intercambio: " + numeros[j] + " <-> " + numeros[j + 1]);
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    cambios++;
                    hayCambio = true;
                    if (pasos) {
                        System.out.print("Estado -> ");
                        printArray(numeros);
                    }
                }
            }
            if (!hayCambio) break;
        }

        System.out.println("Comparaciones: " + comparaciones + ", Cambios: " + cambios);
        return new int[]{comparaciones, cambios};
    }

    private int[] sortDescendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        int comparaciones = 0;
        int cambios = 0;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 0; i < n - 1; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                if (numeros[j] < numeros[j + 1]) {
                    if (pasos) System.out.println("Intercambio: " + numeros[j] + " <-> " + numeros[j + 1]);
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    cambios++;
                    hayCambio = true;
                    if (pasos) {
                        System.out.print("Estado -> ");
                        printArray(numeros);
                    }
                }
            }
            if (!hayCambio) break;
        }

        System.out.println("Comparaciones: " + comparaciones + ", Cambios: " + cambios);
        return new int[]{comparaciones, cambios};
    }

    public void printArray(int[] numeros) {
        for (int num : numeros) System.out.print(num + " ");
        System.out.println();
    }
}

