public class SortSelection {

    public SortSelection() {
    }

    public void sortAscendente(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                int aux = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = aux;
            }
        }
    }

    public void sortDescendente(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMayor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[indiceMayor]) {
                    indiceMayor = j;
                }
            }
            if (i != indiceMayor) {
                int aux = numeros[i];
                numeros[i] = numeros[indiceMayor];
                numeros[indiceMayor] = aux;
            }
        }
    }
}