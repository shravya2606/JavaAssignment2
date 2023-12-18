package javaTwo;

import java.util.Scanner;

public class qnNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size - 1]; 

        System.out.println("Enter " + (size - 1) + " elements of the array (1 to " + size + "):");
        for (int i = 0; i < size - 1; i++) {
            arr[i] = sc.nextInt();
        }


        int missingNumber = findMissingNumber(arr, size);

        System.out.println("Missing number in the array: " + missingNumber);

        sc.close();
    }

    private static int findMissingNumber(int[] arr, int size) {
        int expectedSum = (size * (size + 1)) / 2;
        int actualSum = 0;

        for (int value : arr) {
            actualSum += value;
        }

        return expectedSum - actualSum;
    }
}
