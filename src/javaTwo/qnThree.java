package javaTwo;
import java.util.Arrays;
import java.util.Scanner;

public class qnThree {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to remove");
        int remEl = sc.nextInt();
        int[] newArr = remElement(arr,remEl);
        System.out.println("Array after removing " + remEl + ": " + Arrays.toString(newArr));
        sc.close();
        }
	private static int[] remElement(int[] arr, int remEl) {
        int newN = arr.length - 1;
        int[] newArr = new int[newN];
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != remEl) {
                newArr[newIndex++] = arr[i];
            }
        }

        return newArr;
    }

}
