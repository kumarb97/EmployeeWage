package employeewage;

public class empwage_month {
	public static void main(String[] args) {
		int wage_per_hr = 20;
		int emp_worked_hr = 8;
		int parttime_worked = 8;
		int monthly_workingdays = 20;
		double emp_check =Math.floor((Math.random() * 10) % 2);
		if (emp_check == 1)
		{
			System.out.println("Employee is present and");
		}
		else
		{
			System.out.println("Employee is absent");
		}
		if (emp_check == 1)
		{
			int emp_monthly_wage = ((wage_per_hr * emp_worked_hr) + (parttime_worked * wage_per_hr)) * monthly_workingdays;
			System.out.println("Employee's monthly wage is " +emp_monthly_wage);
		}
}
}
