package exception;
 // NO Exception Handling in action 
public class TestTryCatch {

	public static void main(String[] args) {
		try{
			String arr[]=new String[3];
			System.out.println(arr[3]);
			System.out.println("rest");
			System.out.println("of");
			System.out.println("the");
			System.out.println("code");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Program completed & Finally block executed");
		}
	}
}
