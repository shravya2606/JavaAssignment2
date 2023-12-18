package javaTwo;

import java.util.Scanner;

public class qnFour {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the no of elements");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < n; i++) {
			    arr[i] = sc.nextInt();
			}
			System.out.println("Enter the index to add element");
			int position = sc.nextInt();
			System.out.println("Enter the element add");
			int addElement = sc.nextInt();
			int[] newArr = insertElement(arr, addElement, position);
			System.out.println("Array after inserting " + addElement + " at position " + position + ":");
			for (int value : newArr) {
	            System.out.print(value + " ");
	        }
		}

	}
	private static int[] insertElement(int[] arr, int addElement, int position)
	{
		int newN = arr.length + 1;
		int[]  newArr = new int[newN];
		for(int i = 0; i< position - 1; i++)
		{
			newArr[i] = arr[i];
		}
		newArr[position-1] = addElement;
		for (int i = position; i < newN; i++) {
            newArr[i] = arr[i - 1];
        }

        return newArr;
		
	}

}
