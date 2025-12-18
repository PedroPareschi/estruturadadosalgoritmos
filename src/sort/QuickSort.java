package sort;

import java.util.Arrays;

public class QuickSort {

    // Utiliza-se um pivô, um elemento é selecionado e, simultaneamente, todos os elementos menores do que ele
    // são jogados a esquerda dele e os maiores a direita.
    // Ao terminar de atravessar o array, ele estará na posição correta.
    // Repete-se para cada subarray à esquerda e à direita do pivô
    // in place, porém instável
    // O (n log n) geralmente

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void quickSort(int[] input, int start, int end) {
        // Se o array for de um elemento ou menos, encerrar
        if (end - start < 2) {
            return;
        }
        // o metodo partition retorna o último index do pivot
        int pivotIndex = partition(input, start, end);
        // Repete o metodo à esquerda e à direita do pivot
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // Usando o primeiro elemento como o pivô
        int pivot = input[start];
        int i = start;
        int j = end;

        // Até i e j se cruzarem
        while (i < j) {
            // Loop vazio: decrementando j o array pela direita até encontrar um elemento menor que o pivô
            while (i < j && input[--j] >= pivot);
            // Se j não cruzou i
            if (i < j) {
                // colocar o valor de input[j] no lugar do numero menor
                input[i] = input[j];
            }
            // mesma coisa agora para i
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        // Colocar o pivot no meio e retornar a sua posição
        input[j] = pivot;
        return j;
    }
}
