package sort.exercicios;

import java.util.Arrays;

public class Exercicio1MergeSort {
    // Modifique o algoritmo de merge sort para fazer a ordenação em ordem decrescente

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSortDescendingOrder(intArray, 0, intArray.length);

        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSortDescendingOrder(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortDescendingOrder(input, start, mid);
        mergeSortDescendingOrder(input, mid, end);
        // Juntando os arrays de forma ordenada
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] >= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        // Criando array com espaço o suficiente para os arrays unidos
        int[] temp = new int[end - start];

        // transversando o array
        while (i < mid && j < end) {
            // Colocando o item no array temporário de forma ordenada
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        // Otimização: os elementos que sobrarem serão jogados para o final do array
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // Copiando o temp array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
