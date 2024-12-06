public class Example2
 {
  public static void main(String[] args) {
    int num = 100; 
    int count; 
	
    for (int i = 1; i <= num; i++) {
      count = 0;  // Reset counter for each 'i'

      for (int j = 2; j <= i / 2; j++) 
		  {
        if (i % j == 0) {
          count++;  
          break;
        }
      }

      // If the count is 0, 'i' is prime
      if (count == 0) {
        System.out.println(i);  // Output the prime number
      }
    }
  }
}