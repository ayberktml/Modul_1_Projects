import java.util.Random;
import java.util.Scanner;

/**
 *
 */
public class ArrayUtils {


    /**
     * @param arr
     * @param greaterThan
     * @return
     */
    public static int countGreaterThan(int[] arr, double greaterThan) {
        return countGreaterThan(arr, (int) greaterThan);
    }

    /**
     * @param arr
     * @param greaterThan
     * @return
     */
    public static int countGreaterThan(int[] arr, int greaterThan) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > greaterThan) count++;
        return count;
    }

    /***
     *
     * @param arr
     * @return
     */
    public static double average(int[] arr) {
        double sum = 0.;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum / arr.length;
    }


    /***
     *
     * @param arr
     * @return
     */
    public static long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }


    /**
     * @param arr
     * @param value
     */
    public static void fillArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = value;
    }

    /**
     * @param arr
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * @param length
     * @return
     */
    public static int[] generateIntArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 1000);
        return arr;
    }

    /**
     * @param length
     * @return
     */
    public static int[] generateIntArray(int length, int bound) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * bound);
        return arr;
    }

    /**
     *
     * @param arr
     * @return
     */
    public static int[] shuffle(int[] arr){
        // TODO : think about 0-length array
        if(arr.length == 0) return arr;
        for(int i = 0; i < arr.length - 1; i++) {
            int index = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }


    /**
     *
     * @param arr
     * @param arr2
     */
    public static void shuffle(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }

        Random random = new Random();

        for (int i = arr1.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Swap arr1[i] with arr2[index] and arr2[i] with arr1[index]
            int temp = arr1[i];
            arr1[i] = arr2[index];
            arr2[index] = temp;

            temp = arr2[i];
            arr2[i] = arr1[index];
            arr1[index] = temp;
        }
    }



}
