package in.mindcraft;

//VarArg Variable Argument list
public class Tester {

	public static String add(String s,int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		return s+sum;
	}
	
	public static void main(String[] args) {
		System.out.println(" Using Variable Argument list ");
		System.out.println(add(" Addition is: ",1,2,3,4,5));
		System.out.println(add(" Addition is: ",1,2,3,4));
		System.out.println(add(" Addition is: ",2,6));

	}

}
