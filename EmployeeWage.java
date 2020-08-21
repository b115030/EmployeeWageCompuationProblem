public class EmployeeWage {

	public final int WAGE_PER_HOUR=20;
	public final int HALF_HOURS_PER_DAY=4;
	public final int FULL_HOURS_PER_DAY=8;
   public int attendance() {
	   
	   int n=(int)(Math.random()*3);
	   return n;
   }
	public static void main(String[] args) {
		EmployeeWage ewc =new EmployeeWage();
		System.out.println("**Welcome to Employee Wage Computation Problem**");
		for(int i=1;i<=20;i++) {
			System.out.print("Wage of Employee on"+i+"th day:");
			switch(ewc.attendance()) {
			case 1: System.out.println((ewc.WAGE_PER_HOUR*ewc.FULL_HOURS_PER_DAY)+" Rs");
					break;
			case 2: System.out.println((ewc.WAGE_PER_HOUR*ewc.HALF_HOURS_PER_DAY)+" Rs");
					break;
			default: System.out.println("0 Rs");
			}
			
		}
	}
}
