package javaTwo;
import java.util.Scanner;
public class qnFive {

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
		int max = findMax(arr);
		int min = findMin(arr);
		System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
		sc.close();

	}
	private static int findMax(int[] arr)
	{
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	private static int findMin(int[] arr)
	{
		int min = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}

}
