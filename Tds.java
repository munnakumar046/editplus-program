//find the tds of 10% from salary
import java.util.Scanner;
class Tds{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first salary");
		
		int s=sc.nextInt();
	    float tax=(float)s*10/100;
		System.out.println("the value of tds is " +tax);
        }
}