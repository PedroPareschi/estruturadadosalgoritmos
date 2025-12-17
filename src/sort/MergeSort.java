package sort;

import java.util.Arrays;

public class MergeSort {
    // Dividir para conquistar. Divide-se o array em arrays menores até somente haver arrays de um elemento só
    // Compara-se da direita para esquerda, um array com seu irmão, e usamos um array temporário para criar um array ordenado
    // fundindo esses dois irmãos. Depois, copiamos o array temporário de volta para o array original. Fazemos do menor para o maior
    // e depois da esquerda para direita até termos o array original ordenado
    // Não é in place porque usamos um array temporário
    // Complexidade: O(n log n) - logarítmica
    // Estável


    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end) {
        // Divide-se o array em arrays menores até termos arrays de um elemento só
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        // Fazendo isso recursivamente, para os arrays da esquerda e da direita
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        // Juntando os arrays de forma ordenada
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        // Otimização: Se o array já tiver ordenado, pular
        if (input[mid - 1] <= input[mid]) {
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
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // Otimização: os elementos que sobrarem serão jogados para o final do array
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // Copiando o temp array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
