// write a java program on Implicit 
/*import java.util.Scanner;
class Typec
	{
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer value");
		int a=sc.nextInt();
		double d=a;
		System.out.println(d);
		}
	}
	*/
// write a java program on explicit

import java.util.Scanner;
class Typec{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of integer");
		float i=sc.nextInt();
		System.out.println("integer value is " +i);
		byte b=(byte)i;
		System.out.println("After explicit the value is "+b);
	}
}