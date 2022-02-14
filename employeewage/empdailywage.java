package employeewage;

public class empdailywage {
	public static void main(String[] args) {
	int wage_per_hr = 20;
	int emp_worked_hr = 8;
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
		int emp_daily_wage = wage_per_hr * emp_worked_hr;
		System.out.println("Employee's daily wage is " +emp_daily_wage);
	}

}
}
