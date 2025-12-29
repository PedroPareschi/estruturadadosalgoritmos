package sort.exercicios;

public class Exercicio2InsetionSort {

    // Modifique o insetion sort para que utilize uma implementação recursiva

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insetionSort(intArray, 1);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void insetionSort(int[] input, int firstUnsortedIndex) {
        if (firstUnsortedIndex == input.length) {
            return;
        }
        int newElement = input[firstUnsortedIndex];

        int i;

        for (i = firstUnsortedIndex; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;

        insetionSort(input, firstUnsortedIndex + 1);
    }
}

