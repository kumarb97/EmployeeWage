package employeewage;

public class employeecheck {
	public static void main(String[] args) {
		
		double emp_check =Math.floor((Math.random() * 10) % 2);
		if (emp_check == 1)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
		
	}

}
