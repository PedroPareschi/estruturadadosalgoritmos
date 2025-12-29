package sort.exercicios;

public class Exercicio3RadixSort {

    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // do radix sort
        radixSort(stringsArray, 26, 4);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getCharacter(position, value)]++;
        }

        // Ajustando o array de contagem
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getCharacter(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getCharacter(int position, String value) {
        char letter = value.charAt(position);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.indexOf(letter);
    }

}
