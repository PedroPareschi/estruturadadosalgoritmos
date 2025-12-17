package sort;

import java.util.Arrays;

public class SelectionSort {

    // O maior número é selecionado e jogado para o final da parte não ordenada da lista
    // O(n^2)
    // Instável (valores iguais são trocados de lugar)

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // limita a parte não ordenada da lista
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // Variável para guardar a posição do maior valor da estrutura
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
