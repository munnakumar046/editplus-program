import java.util.Scanner;
class PrimeNum
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
			for(int i=2;i<=n/2;i++)
			{
				if(n%2==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println("It is a prime number");
			else
				System.out.println("It is a not prime number");
		}
}
