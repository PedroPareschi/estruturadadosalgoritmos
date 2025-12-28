package sort;

import java.util.Arrays;

public class CountingSort {
    // Assumimos que o array esteja num determinado intervalo e os valores a serem ordenados sejam inteiros
    // Criamos um array auxiliar para contar quantos itens de determinado valor temos em um array.
    // Com esse array auxiliar refazemos o array original sem comparação, só usando a contagem do array auxiliar
    // O(n). Com passos extras pode ser estável. Não é in-place

    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(intArray, 1, 10);
        System.out.println(Arrays.toString(intArray));
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
