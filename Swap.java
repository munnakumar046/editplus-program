import java.util.Scanner;
class Swap
	{
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping first number is  "+a+"and second number is"  +b);
		}
}