package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    // Usa-se uma função hashing para juntar os itens em um HashMap, os itens que colidem sao então ordenados e os
    // depois faz-se o merge de todos os itens. Deve-se garantir que os itens no bucket menor sao menores que os do bucket maior
    // complexidade o(n) no melhor cenário. Não é inplace e estabilidade depende do algoritmo usado para ordenar os itens dentro do bucket

    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};
        bucketSort(intArray);
        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int j : input) {
            buckets[hash(j)].add(j);
        }

        for (List bucket: buckets) {
            Collections.sort(bucket);
        }


        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value: buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / 10;
    }
}
