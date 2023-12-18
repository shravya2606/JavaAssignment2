/**
 * 
 */
package javaTwo;

/**
 * 
 */
import java.util.Scanner;
public class qnSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in array 1");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		System.out.println("Enter the elements of the array1:");
		for (int i = 0; i < n1; i++) {
		    arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the no of elements in array 2");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter the elements of the array2:");
		for (int i = 0; i < n2; i++) {
		    arr2[i] = sc.nextInt();
		}
		boolean hasCommon = false;

        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j < n2; j++) {
                if (arr1[i]==(arr2[j])) {
                    System.out.println("Common values found: " + arr1[i]);
                    hasCommon= true;
                }
            }
        }

        if (!hasCommon) {
            System.out.println("No Common values found.");
        }

        sc.close();

	}

}
