package employeewage;

public class empwage_usingcase {
	public static void main(String[] args) {
		int wage_per_hr = 20;
		int emp_worked_hr = 8;
		int parttime_worked = 8;
		double emp_check =Math.floor((Math.random() * 10) % 2);
		switch((int)emp_check) {
		case 0 :
			System.out.println("Employee is absent");
			break;
		case 1 :
			System.out.println("Employee is present and");
			int emp_daily_wage = (wage_per_hr * emp_worked_hr) + (parttime_worked * wage_per_hr);
			System.out.println("Employee's daily wage is " +emp_daily_wage);
		}

}
}
