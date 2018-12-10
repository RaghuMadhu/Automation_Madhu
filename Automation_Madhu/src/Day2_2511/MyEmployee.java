package Day2_2511;

 class Employee1 {
	 int Totalsalary;
	public void CalculateSalary(int salary, int bonus)
	{
		int Totalsalary = salary + bonus;
		System.out.println("Total salary is :" +Totalsalary);
	}

}

public class MyEmployee {

	public static void main(String[] args) {
	
		Employee1 Emp = new Employee1();
		Emp.CalculateSalary(800,200);
		
		

	}

}
