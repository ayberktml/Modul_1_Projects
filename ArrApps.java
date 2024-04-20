public class ArrApps {
    public static void main(String[] args) {


          int[] arr1 = ArrayUtils.generateIntArray(8, 10);
          int[] arr2 = ArrayUtils.generateIntArray(8, 10);

          System.out.println("Original Arrays:");
          ArrayUtils.printArray(arr1);
          ArrayUtils.printArray(arr2);

          ArrayUtils.shuffle(arr1, arr2);

          System.out.println("Shuffled Arrays:");
          ArrayUtils.printArray(arr1);
          ArrayUtils.printArray(arr2);
    }
}
