package exception;
	// Exception Handling in action 
public class TestTryCatch2 {

	public static void main(String[] args) {
		try {
			int value=50/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code!");
	}
}
