package in.mindcraft;

/*2. Accept five integers in an array -
	a. Find maximum and minimum of the integers. Do not sort the array.
	b. Multiply each element of the array by 5 and store it in another array and display it.
*/
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
			int []a = new int[5];
			int []b = new int[5];
									
			System.out.println("Enter five numbers:");
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<a.length;i++)
				a[i]= sc.nextInt();
			
			//Display Original Array
			System.out.print("\nOriginal Array: ");
			for(int num :a)
				System.out.print(num +" ");
			
			sc.close();
			
			int max =a[0];
			int min =a[0];
			
			//Find and display maximum value from original array
			for(int i=1;i<a.length;i++) {
				if(a[i]>max)
					max=a[i];
			}
			System.out.println("\nMaximum value: "+max);
			
			//Find and display minimum value from original array
			for(int i=1;i<a.length;i++) {
				if(a[i]<min)
					min=a[i];
			}
			System.out.println("\nMinimun value: "+min);
			
			
			// Multiply each element by 5 and store in the new array
	        for (int i = 0; i < a.length; i++) {
	            b[i] = a[i] * 5;
	        }
	        
	        System.out.println("\nMultiplied Array: ");
	        for (int num : b) {
	            System.out.print(num + " ");
	        }

	}

}
