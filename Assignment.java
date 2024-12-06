import java.util.Scanner;
class Assignment
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the marks of math");
		int m1=sc.nextInt();
			
		System.out.println("enter the marks of english");
		int m2=sc.nextInt();
		
		if(m1>0 && m1<100 &&m2>0 && m2<100)
		{
			if(m1>m2)
			{
				System.out.println("vailed marks is"+m1 );
			}		
			else{
				System.out.println("Invailed condition! please enter marks higher then marks 2");
			}
			
		}
		else{
			System.out.println("invailed marks should be between 1 and 99");
		}

	}
	
}
		
		
		
		
		
		
		
		/*int m1=95,m2=55,m3=90,m4=35,m5=65,m6=25;
		int total=m1+m2+m3+m4+m5+m6;
		System.out.println(total);
		float average=total/6;
		System.out.println(average);
		if(average>=70)
		{
			System.out.println("GradeA");
		}
		else if(average>=50)
		{
			System.out.println("GradeB");
		}	
		else if(average>=35)
		{
			System.out.println("GradeC");
		}	
		else
		{
			System.out.println("failed");
		}
		*/	
