package exceptiondemo;

public class ThrowsException {
	public static void main (String[] args) throws ArithmeticException{
		int a = 100;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
}
