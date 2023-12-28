package exceptiondemo;

public class Exceptions {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		String name = null;
		int a = 0;
		int b = 10;
		
		try {
			int c = b/a;
			if (name.equals("Regmi")) {
				System.out.println("HEHE");
			}
			for (int i = 0; i<6; i++) {
				System.out.println(arr1[i]);
			}
			
		}
		catch (NullPointerException ex) {
			System.out.println("Null Pointer Exception");
		}
		
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array Index out of bounds");
		}
		catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception");
		}
		
	}
}
