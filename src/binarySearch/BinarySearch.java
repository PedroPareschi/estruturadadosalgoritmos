package binarySearch;

public class BinarySearch {
    // Algoritmo de busca para estruturas ordenadas que divide a estrutura no meio, compara o valor. Se for igual, termina
    // Se não, repete o processo a esquerda (se for menor) e a direita (se for maior)
    // Complexidade O(logn)

    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 55));
        System.out.println(recursiveBinarySearch(intArray, -22));
        System.out.println(recursiveBinarySearch(intArray, 1321));

    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int end = input.length - 1;
        int start = 0;
        int mid = (end + start) / 2;
        while (input[mid] != value && start < end) {
            if (input[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (end + start) / 2;
        }
        return input[mid] == value ? mid : -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) / 2;
        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}
