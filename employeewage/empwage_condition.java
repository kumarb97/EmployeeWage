package employeewage;

public class empwage_condition {
	public static void main(String[] args) {
		int wage_per_hr = 20;
		int emp_present = 0;
		int total_wage = 0;
		int emp_daily_wage = 0;
		
			while (emp_present <= 20)
			{
				double emp_check =Math.floor((Math.random() * 10) % 2);
			if(emp_check ==1)
			{
				emp_daily_wage = (wage_per_hr * 8);
				total_wage = total_wage + emp_daily_wage;
				emp_present++;
			}
		}
			System.out.println("employee's total wage is " +total_wage);
		}

}

