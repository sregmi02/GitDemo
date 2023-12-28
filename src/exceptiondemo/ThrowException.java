package exceptiondemo;
import java.io.*;
public class ThrowException {
	public static void main (String[] args) throws IOException
	{
		int age;
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age:");
		age = Integer.parseInt(bfr.readLine());
		try {
		if (age < 18) {
			throw new Exception("Age Must Be Greater Than 18");
		}
		else {
			System.out.println("You Are Eligible for Voting");
		}
		}
		catch(Exception e) {
			System.out.println("Exception Caught"+e);
			
		}
	}
}
