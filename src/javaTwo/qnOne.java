package javaTwo;
import java.util.Scanner;
public class qnOne {

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
			int sum = 0;
			for (int i = 0; i < n; i++) {
				  sum += arr[i];
				}
			double avg = sum/n;
			System.out.println("Sum is " + sum);
			System.out.println("Average is " + avg);
		}

	}

}
