// WAP to check given number is prime or not with returntype and with argument method?
import java.util.Scanner;
class  PrimeNumber3
{
	public static void main(String[] args) 
	{
		boolean k=prime();
		if(k)
			System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number");
	}
	
	public static boolean prime()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				return true;
			else
				return false;
	}
}
