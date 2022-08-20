package exception;
import java.util.*;
public class test {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		try {
			String name=null;
			System.out.println(name.length());		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("\nExceptiuon has been handled!");
	}
}




