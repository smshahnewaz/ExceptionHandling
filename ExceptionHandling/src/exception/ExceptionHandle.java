package exception;
public class ExceptionHandle {
	public static void main(String[] args) {
		System.out.println("Before Exception Block...");
		try {
			/*
			 * int value=10/0; System.out.println(value);
			 */
			int arr[] = new int[1];
			System.out.println(arr[1]); // we have not assigned a value to arr[5]
		}
		catch (Exception e) {
			System.out.println(e);
		}System.out.println("After Exception Block");
	}
}
