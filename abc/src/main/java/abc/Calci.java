package abc;

	import java.util.Scanner;
	public class Calci {
		public static int addition(int a,int b)
		{
			int sum=a+b;
			return sum;
		}
		public static int subtraction(int a,int b)
		{
			int diff=a-b;
			return diff;
		}
		public static int multiplication(int a,int b)
		{
			int mul=a*b;
			return mul;
		}
		public static double division(int a,int b)
		{
			int div=a/b;
			return div;
		}
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter num1 value:");
			int n1=s.nextInt();
			System.out.println("enter num2 value:");
			int n2=s.nextInt();
			System.out.println("enter your chocies");
			System.out.println(" 1\tAdd\n 2\tSubtract\n 3\tMultiply\n 4\tDivide");
			int operation=s.nextInt();
			switch(operation)
			{
			case 1:	System.out.println("Result="+addition(n1,n2));
			break;
			case 2: System.out.println("Result="+subtraction(n1,n2));
			break;
			case 3: System.out.println("Result="+multiplication(n1,n2));
			break;
			case 4: System.out.println("Result="+division(n1,n2));
			break;
			default: System.out.println("Enter valid a chocie..");
			}
			
		}

	}
