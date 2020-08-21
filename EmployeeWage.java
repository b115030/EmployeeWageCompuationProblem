public class EmployeeWage {
	
	public final int WAGE_PER_HOUR=20;
	public final int HALF_HOURS_PER_DAY=4;
	public final int FULL_HOURS_PER_DAY=8;
	public final int MAX_DAYS=20;
	public final int MAX_HOURS=100;
   public int attendance() {
	   
	   int n=(int)(Math.random()*3);
	   return n;
   }
	public static void main(String[] args) {
		EmployeeWage ewc =new EmployeeWage();
		int total_hours=0;
		int wage;
		int total_monthly_wage=0;
		System.out.println("**Welcome to Employee Wage Computation Problem**");
		for(int i=1;i<=ewc.MAX_DAYS&&total_hours<ewc.MAX_HOURS;i++) {
			System.out.print("Wage of Employee on "+i+"th day:");
			switch(ewc.attendance()) {
			case 1: total_hours+=ewc.FULL_HOURS_PER_DAY;
					wage=ewc.WAGE_PER_HOUR*ewc.FULL_HOURS_PER_DAY;
					System.out.println(wage+" Rs");
					total_monthly_wage+=wage;
					break;
			case 2: total_hours+=ewc.HALF_HOURS_PER_DAY;
					wage=ewc.WAGE_PER_HOUR*ewc.HALF_HOURS_PER_DAY;
					System.out.println(wage+" Rs");
					total_monthly_wage+=wage;
					break;
			default: System.out.println("0 Rs");
			}
			
		}
		System.out.println("Total Monthly Wage for Employee "+total_monthly_wage+" Rs");
	}

}
