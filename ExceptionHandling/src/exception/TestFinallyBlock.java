package exception;
public class TestFinallyBlock {
	public static void main(String [] args) {
		try {
			int value = 25/0;
			System.out.println(value);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			// finally block always executes and executes imp codes
			// it follows try and catch blocks
			System.out.println("Finally block executed!");
		}
	}
}
