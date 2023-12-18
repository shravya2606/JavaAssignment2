package javaTwo;

import java.util.Scanner;

public class qnEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondSmallest = findSecondSmallest(arr);

        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second smallest element: " + secondSmallest);
        } else {
            System.out.println("Array size is less than 2. Cannot find second smallest element.");
        }

        sc.close();
    }

    private static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            return Integer.MAX_VALUE;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value < secondSmallest && value != smallest) {
                secondSmallest = value;
            }
        }

        return secondSmallest;
    }
}
