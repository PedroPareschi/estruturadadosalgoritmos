import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 1;
        intArray[4] = 1452;
        intArray[5] = 0;
        intArray[6] = 99;

        for (int i = 0; i < intArray.length; i ++) {
            System.out.println(intArray[i]);
        }
    }
}