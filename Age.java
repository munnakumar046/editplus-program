import java.util.Scanner;
class Age  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		
		if(age<18)
			System.out.println("u r teen age so u r not eligible for vote ");
		else
			System.out.println("U r eligible to vote");
	}
}