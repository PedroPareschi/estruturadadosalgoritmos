package sort;

import java.util.Arrays;

public class RadixSort {

    // Dados devem ter mesma base e largura, devendo portanto compor somente de inteiros ou strings.
    // É uma ordenação baseada somente em caractere e strings, começando da posição mais a direita, usando um algoritmo
    // de ordenação estável para fazer a ordenação.
    // Estável e in place, dependendo do algoritmo utilizado.
    // O (n)

    public static void main(String[] args) {
        int[] radixArray = { 4724, 4536, 1330, 8792, 1594, 5729 };
        radixSort(radixArray, 10, 4);
        System.out.println(Arrays.toString(radixArray));
    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input) {
            countArray[getDigit(position, value, radix)]++;
        }

        // Ajustando o array de contagem
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
