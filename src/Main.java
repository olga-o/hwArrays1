import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        //System.out.println("Task 1");

        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        boolean[] booleanArray = {true, false, false};

        //Task 2
        System.out.println("\nTask 2");

        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.println(intArray[i]);
                break;
            }
            System.out.print(intArray[i] + ", ");
        }

        for (int i = 0; i < doubleArray.length; i++) {
            if (i == doubleArray.length - 1) {
                System.out.println(doubleArray[i]);
                break;
            }
            System.out.print(doubleArray[i] + ", ");
        }

        for (int i = 0; i < booleanArray.length; i++) {
            if (i == booleanArray.length - 1) {
                System.out.println(booleanArray[i]);
                break;
            }
            System.out.print(booleanArray[i] + ", ");
        }

        //Task 3
        System.out.println("\nTask 3");

        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(intArray[i]);
                break;
            }
            System.out.print(intArray[i] + ", ");
        }

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubleArray[i]);
                break;
            }
            System.out.print(doubleArray[i] + ", ");
        }

        for (int i = booleanArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(booleanArray[i]);
                break;
            }
            System.out.print(booleanArray[i] + ", ");
        }

        //Task 4
        System.out.println("\nTask 4");

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 1) {
                intArray[i] += 1;
            }
        }

        System.out.println(Arrays.toString(intArray));

        System.out.println();
    }
}