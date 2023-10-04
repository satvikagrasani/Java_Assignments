package in.mindcraft;

import java.util.Scanner;

/*
  3.Write a program to accept and display 3 by 3 matrix. Use enhanced for loop for display.
	a.Find the transpose of a matrix and print the transpose. 
	b.Accept another matrix of same dimensions.  
		Find the addition of two matrices and print the resultant matrix. 
*/
public class Tester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//a.Find the transpose of a matrix and print the transpose. 
		
		//first matrix
		int [][]a = new int[3][3];
		System.out.println("Enter number for a 3 x 3 matrix: ");
		
		//input matrix
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		//display first matrix
		System.out.println("\nThe given matrix is: \n");
		//enhanced for loop
		for(int[] og:a) { 
			for(int val:og) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		
		//Create transpose
		int [][] transpose = new int [3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				transpose[i][j] = a[j][i];
			}
		}
		
		//Display transpose
		System.out.println("\nThe Transpose of given matrix is: \n");
		//enhanced for loop
		for(int[] tr:transpose) {
			for(int val:tr) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		
		//b.Accept another matrix of same dimensions.
		//Find the addition of two matrices and print the resultant matrix.
		
		//second matrix
		int [][]b = new int[3][3];
		System.out.println("\nEnter number for Second 3 x 3 matrix: \n");
		
		//input matrix
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		//display second matrix
		System.out.println("\nThe Second matrix is: \n");
		//enhanced for loop
		for(int[] og2:b) { 
			for(int val2:og2) {
				System.out.print(val2+" ");
			}
			System.out.println();
		}
		

        // c matrix to store the sum
        int[][] c = new int[3][3];

        // Add matrices a and b 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display matrix c
        System.out.println("\nThe sum of first matrix  and second matrix is: \n");
        for (int[] row : c) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Close the scanner
        sc.close();
		
	}
	
}
