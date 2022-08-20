package exception;
import java.io.IOException;
import java.util.*;
public class EmpBonus {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		System.out.println(":::::::: Welcome to Employee Bonus Portal :::::::::");
		int bonus1;int bonus2;int bonus3;
		
		System.out.print("\nEnter Employee Grade :");
		char grade=sc.next().charAt(0);
		if(grade=='A'||grade=='a') {
			System.out.print("Enter Bonus          :$");
			bonus1=sc.nextInt();
			if(bonus1>1000) {
				throw new NoSuchFieldException("Not applicable for this Grade!");
			}
		}else if(grade=='B'||grade=='b') {
			System.out.print("Enter Bonus          :$");
			bonus2=sc.nextInt();
			if(bonus2>700) {
				throw new NoSuchFieldException("Not applicable for this Grade!"); 
			}
		}else if(grade=='C' ||grade=='c') {
			System.out.print("Enter Bonus          :$");
			bonus3=sc.nextInt();
			if(bonus3>500) {
				throw new NoSuchFieldException("Not applicable for this Grade!"); // could no think of nay other type of exception
			}
		}
		System.out.println("Correct Amount! Employee Bonus Assigned Successfully!");
	}
}





