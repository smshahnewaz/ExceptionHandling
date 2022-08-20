package exception;

import java.io.IOException;

import java.util.*;

public class ThrowExample {
	
		static Scanner sc = new Scanner(System.in);
		
		public static void moneyWithdraw() throws Exception, IOException {
			
		int availBalance=500;
		
		System.out.println("Enter Withdraw Amount   :");
		
		int wAmount=sc.nextInt();
		
		int rBalance=availBalance-wAmount;
		
		if(wAmount>500) {
			throw new Exception("insufficeint funds!");
		}else {
			System.out.println("Available Balance           : $"+availBalance);
			System.out.println("Withdrwal Amount  Requested : $"+wAmount);
			System.out.println("Remaining balalce           : $"+rBalance);
		}		
}
	public static void main(String [] args) {
		System.out.println("=== Welcome to ATM ===");
		ThrowExample obj=new ThrowExample();
		try {
			obj.moneyWithdraw();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
