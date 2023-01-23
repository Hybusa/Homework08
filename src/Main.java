import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();

    }

    private static void task1() {
        System.out.println("Task 1");
        Integer[] numsInt = new Integer[]{1, 2, 3};
        Double[] numsDouble = new Double[]{1.57, 7.654, 9.986};
        String[] numsFree = {"This", "is", "task", "number", "one"};
        Integer[] numsMethod = getNRandomNumbersInRange(10, -10, 15);

        System.out.println(Arrays.toString(numsInt));
        System.out.println(Arrays.toString(numsDouble));
        System.out.println(Arrays.toString(numsFree));
        System.out.println(Arrays.toString(numsMethod));
        System.out.println();

        System.out.println("Task 2");

        printArray(numsInt);
        printArray(numsDouble);
        printArray(numsFree);
        printArray(numsMethod);

        System.out.println();

        System.out.println("Task 3");

        printReverseArray(numsInt);
        printReverseArray(numsDouble);
        printReverseArray(numsFree);
        printReverseArray(numsMethod);
        System.out.println();

        System.out.println("Task 4");

        printArray(makeAllNumbersInArrayEven(numsInt));
        System.out.println();
    }


    public static Integer[] makeAllNumbersInArrayEven(Integer[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i]++;
            }
        }
        return nums;
    }

    public static <T> void printArray(T[] array) {
        int i = 0;
        for (T element : array) {
            if (i++ == array.length - 1)
                System.out.println(element);
            else
                System.out.print(element + ", ");
        }
    }

    public static <T> void printReverseArray(T[] array) {

        for (int i = (array.length - 1); i >= 0; i--) {
            if (i == 0)
                System.out.println(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
    }


    public static Integer[] getNRandomNumbersInRange(int n, int min, int max) {
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) ((Math.random() * (max - min)) + min);
        }
        return nums;
    }
}