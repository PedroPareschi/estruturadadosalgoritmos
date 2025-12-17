package sort;

import java.util.Arrays;

public class InsetionSort {
    // Divide-se o array em parte ordenada e não ordenada. O primeiro numero da parte não ordenada volta as casas até
    // chegar na sua posição na parte ordenada
    // O(n^2)
    // Estável

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }


        System.out.println(Arrays.toString(intArray));
    }
}
