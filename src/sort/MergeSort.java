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
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };



        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

    }
}
