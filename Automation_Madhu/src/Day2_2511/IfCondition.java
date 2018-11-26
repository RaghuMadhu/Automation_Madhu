package Day2_2511;

public class IfCondition {

	public static void main(String[] args) {
		int a = 10;
		int b = 16;
		int c = 12;
		if (a>b)
			System.out.println("A is greater than B");
		else if (b>c)
			System.out.println("B is greater than C");
		else if (b>a)
			System.out.println("B is greater than A");
		else if (a>c)
			System.out.println("A is greater than C");
		else if (c>a)
			System.out.println("C is greater than A");
		else 
			System.out.println("C is greater than B");

	}

}
