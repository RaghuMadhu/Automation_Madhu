package Day2_2511;

class Emp
{
	int total;
	public void cal (int a, int b)
	{
	total = a + b;
	System.out.println("total is " +total);
	}
}
 
public class Employee{
	public static void main (String args[]){
	Emp e = new Emp();
	e.cal(4,8);
	
	}
}