//Q) Write a java program to insert some elements in array and display them?
import java.util.Scanner;
class Text 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		//for insert element
		for(int i=0; i<=arr.length;i++)
		//System.out.println("Enter the element");
		{System.out.println("Enter the element");
			arr[i]=sc.nextInt();
		}
		//display element
		for(int j=0;j<=arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
}
