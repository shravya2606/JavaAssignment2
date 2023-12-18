package javaTwo;

import java.util.Scanner;
public class qnTwo {
	public static int findIndex(int[] arr, int index)
	{
		if (arr == null)
            return -1;
		int n = arr.length;
		int i = 0;
		while(i<n)
		{
			if(arr[i] == index)
				return i;
			else
				i = i+1;  
		}
		return -1;
		
		
	}

public static void main(String[] args) {
	try (// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in)) {
		int n;
		System.out.println("Enter the no of array elements");
		n = sc.nextInt();
		int[] arr = new int[100];
		System.out.println("Enter the elements");
		for(int i = 0; i< n;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Index position of 11 is: " + findIndex(arr, 11));
		
		// Find and print the index position of value 22 n 11 in the array.
		System.out.println("Index position of 22 is: " + findIndex(arr, 22));
	}

}
}