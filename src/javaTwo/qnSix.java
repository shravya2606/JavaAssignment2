package javaTwo;
import java.util.Scanner;
public class qnSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.next();
		}
		boolean hasDuplicates = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate values found: " + arr[i]);
                    hasDuplicates = true;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }

        sc.close();

	}
	
}
