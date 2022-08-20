package exception;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int v1=Integer.parseInt(args[0]); 
			int v2=Integer.parseInt(args[1]); 
			int result=v1/v2; System.out.println(result);
			
			String name=null;
			System.out.println(name.length());		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NumberFormatException ex) { // occurs while user input different data type		
			ex.printStackTrace();
		}
		catch(NullPointerException ex1) {
			System.out.println("Is is a Null value");
		}
		catch(ArithmeticException ex2) {
			System.out.println(ex2);
		}
		catch (Exception ex3) {
			System.out.println(ex3);
		}
		finally {
			// finally block always executes and executes imp codes
			// it follows try and catch blocks
			System.out.println("Program has been completed!");
		}
	}
}
