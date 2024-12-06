//Find the average & total of 5 subject marks.
class Marks 
{
	public static void main(String[] args) 
	{
		int m1=89,m2=45,m3=65,m4=74,m5=49,m6=58;
		
		int total=m1+m2+m3+m4+m5+m6;
		
		float avg=(float)total/6;
		
		System.out.println("Total : "+total);
		System.out.println("Average :"+avg);
	}
}