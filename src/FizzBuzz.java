
public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			int number = 0;
			
			if (number + i % 3 == 0) {
				System.out.println("Fizz");
			} else if (number + i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(number + i);
			}
		}
		
	}
	
}
