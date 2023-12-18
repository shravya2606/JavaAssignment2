package javaTwo;

import java.util.Scanner;

public class qnTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		boolean hasZero = false;
		boolean hasMinusOne = false;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                    System.out.println("0 values found at the psotion: " + i);
                    hasZero = true;
                }
            if(arr[i] == -1)
            {
                System.out.println("-1 values found at the psotion: " + i);
                hasMinusOne = true;
            }
            }

        if (!hasZero) {
            System.out.println("No Zeroes found.");
        }
        if (!hasMinusOne) {
            System.out.println("No -1 found.");
        }

        sc.close();

	}

}
