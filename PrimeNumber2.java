// WAP to check given number is prime or not using no return type with with argument method?
import java.util.Scanner;
class  PrimeNumber2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		prime(n);
	}
	public static void prime(int n)
	{
		boolean flag=true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag && n>1)
			System.out.println("prime");
		else
			System.out.println("not prime");				
	}
}
