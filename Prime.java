import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			
			}
			
			
		}
		if(count>=2)
			System.out.println("is not prime"+n);
		else
			System.out.println("is prime"+n);
		
		
	}
		
		
}
