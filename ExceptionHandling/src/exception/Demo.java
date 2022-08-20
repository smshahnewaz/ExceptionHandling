package exception;

import java.io.BufferedReader;
 
import java.io.IOException;
 
import java.io.InputStreamReader;
 
public class Demo {
 
int a,b,c;
 
BufferedReader br;
 
void accept()
 
{
 

try
 
{
 
System.out.println("Accept Method Started");
 
br=new BufferedReader(new InputStreamReader(System.in));
 
System.out.println("Enter First Number");
 
a=Integer.parseInt(br.readLine());
 
System.out.println("Enter Second Number");
 
b=Integer.parseInt(br.readLine());
 
c=a/b;
 
}
 

catch(ArithmeticException e)
 
{
 
System.out.println("Please provide the integer without Zero");
 
}catch(NumberFormatException e)
 
{
 
System.out.println("Please enter only numbers");
 
}
 
catch(Exception e)
 
{
 
System.out.println("Parent Exception Hadled"); 
 
}
 
finally
 
{
 
System.out.println("Finally");
 
try {
 
br.close();
 
} catch (IOException e) {
 
// TODO Auto-generated catch block
 
e.printStackTrace();
 
}
 
}
 
System.out.println("Result"+c);
 
System.out.println("Accept Method Ended");
 


}
 
void display()
 
{
 
System.out.println("Display Method Started");
 
System.out.println("Display Method Ended");
 
}
 
public static void main(String[] args) {
 
System.out.println("Main Method Started");
 
Demo d=new Demo();
 
d.accept();
 
d.display();
 
System.out.println("Main Method Ended");
 
}
 

}
