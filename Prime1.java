import java.util.Scanner;
class Prime1
{
    public static void main(String[] args)
    {
        //caller method
        prime();

    }

    //callie method
    public static void prime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

	boolean flag=true;

	for(int i=2; i<=n/2;i++);
	{
		if(n%i==0)
		{
			flag=false;
			break;	
		}
	}
	if(flag==true)
		System.out.println("it is prime number");
	else
		System.out.println("it is not Prime number");
       
    }
}

