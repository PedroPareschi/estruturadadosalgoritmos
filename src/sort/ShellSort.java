package sort;

import java.util.Arrays;

public class ShellSort {
    // Divide-se o array em parte ordenada e não ordenada, e implementa-se de forma parecida com insetion sort, a diferença é que
    // o gap usado para fazer as comparações é maior no começo, até diminuir para 1, onde começa a se comportar como insetion sort
    // Complexidade: O(n^2) no pior caso
    // Instável

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }


        System.out.println(Arrays.toString(intArray));
    }
}
